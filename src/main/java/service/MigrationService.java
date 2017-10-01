package service;

import mapper.CpuInfoMapper;
import mapper.MemoryInfoMapper;
import mapper.ServerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.CpuInfo;
import pojo.MemoryInfo;
import vo.Migration;
import vo.PhysicalServer;
import vo.Vm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @create 2017-09-24 20:20
 **/
@Service
public class MigrationService {
    @Autowired
    ServerMapper serverMapper;
    @Autowired
    CpuInfoMapper cpuInfoMapper;
    @Autowired
    MemoryInfoMapper memoryInfoMapper;

    /**
     * getMigrationListByClusterName
     * @param ClusterName
     * @return
     */
    public Migration getMigrationListByClusterName(String ClusterName){
        //创建策略
        Migration migration = new Migration();
        //cpu memory百分比的平均值
        double cpuPercentAvg;
        double memoryPercentAvg;
        //高利用率cpu队列
        List<PhysicalServer> highCpuPercentList = new ArrayList<PhysicalServer>();
        //高利用率memory队列
        List<PhysicalServer> highMemoryPercentList=new ArrayList<PhysicalServer>();
        //低利用率cpu队列
        List<PhysicalServer>  lowCpuPercentList=new ArrayList<PhysicalServer>();
        //低利用率memory队列
        List<PhysicalServer>  lowMemoryPercentList=new ArrayList<PhysicalServer>();
        //得到所有物理机
        List<PhysicalServer> physicalServerList = getPhysicalServerByClusterName(ClusterName);
        //遍历物理机，并通过ip来获取平均cpu memory
        for (PhysicalServer physicalServer : physicalServerList) {
            //获得物理机ip
            String ip = physicalServer.getPhysicalServerIp();
            //获取各项平均值
            cpuPercentAvg = getAvgOfLastHourCpuPercent(ip);
            memoryPercentAvg = getAvgOfLastHourMemoryPercent(ip);

            //初始化物理机平均值
            physicalServer.setAvgOfLastHourCpuPercent(cpuPercentAvg);
            physicalServer.setAvgOfLastHourmemoryPercent(memoryPercentAvg);

            //选出超过cpu memory双阈值的物理机
            if(cpuPercentAvg>10){
                highCpuPercentList.add(physicalServer);
            }
            if(cpuPercentAvg<10){
                lowCpuPercentList.add(physicalServer);
            }
            if(memoryPercentAvg>10){
                highMemoryPercentList.add(physicalServer);
            }
            if(memoryPercentAvg<10){
                lowMemoryPercentList.add(physicalServer);
            }
        }

        for(PhysicalServer physicalServer : highCpuPercentList ){
            Vm maxCpuPercentVm  =  getMaxCpuPercentVmByPhysicalServer(physicalServer);
            physicalServer.setMaxCpuPercentVm(maxCpuPercentVm);
        }
        for(PhysicalServer physicalServer : highMemoryPercentList ){
            Vm maxMemoryPercentVm  =  getMaxMemoryPercentVmByPhysicalServer(physicalServer);
            physicalServer.setMaxMemoryPercentVm(maxMemoryPercentVm);
            System.out.println(physicalServer);
        }

        migration.setHighCpuPercentList(highCpuPercentList);
        migration.setHighMemoryPercentList(highMemoryPercentList);
        migration.setLowCpuPercentList(lowCpuPercentList);
        migration.setLowMemoryPercentList(lowMemoryPercentList);
        return migration;

    }

    /**
     * getMaxCpuPercentVmByPhysicalServer
     * @param physicalServer
     * @return
     */
    private Vm getMaxCpuPercentVmByPhysicalServer(PhysicalServer physicalServer) {
        Double maxCpuPercent= 0.0;
        Vm maxCpuPercentVm = null;
        List<Vm> vmList = serverMapper.getAllVoByServerIp(physicalServer.getPhysicalServerIp());

        for(Vm vm : vmList){
            maxCpuPercent = maxCpuPercent>vm.getCpuPercent()?maxCpuPercent:vm.getCpuPercent();
        }
        for(Vm vm : vmList){
           if (Math.floor(vm.getCpuPercent())==Math.floor(maxCpuPercent)){
               maxCpuPercentVm = vm;
           }
        }
        return maxCpuPercentVm;
    }

    /**
     * getMaxMemoryPercentVmByPhysicalServer
     * @param physicalServer
     * @return
     */
    private Vm getMaxMemoryPercentVmByPhysicalServer(PhysicalServer physicalServer) {
        Double maxMemoryPercent= 0.0;
        Vm maxMemoryPercentVm = null;
        List<Vm> vmList = serverMapper.getAllVoByServerIp(physicalServer.getPhysicalServerIp());
        for(Vm vm : vmList){
            maxMemoryPercent = maxMemoryPercent>vm.getMemoryPercent()?maxMemoryPercent:vm.getMemoryPercent();
        }
        System.out.println(maxMemoryPercent);

        for(Vm vm : vmList){
            vm.setMemoryPercent(maxMemoryPercent.floatValue());
            if(Math.floor(vm.getMemoryPercent())==Math.floor(maxMemoryPercent.floatValue())){
                maxMemoryPercentVm = vm;
            }
        }
        return maxMemoryPercentVm;
    }


    /**
     * 获取物理机
     * @param clusterName
     * @return List<PhysicalServer>
     */
    public List<PhysicalServer> getPhysicalServerByClusterName(String clusterName) {
        return serverMapper.getAllPhysicalServerByCluster(clusterName);
    }

    /**
     * 获取最近1h的cpu百分比平均值
     * @param ip
     * @return double
     */
    public double getAvgOfLastHourCpuPercent(String ip){
        //获得物理机过去1h情况
        List<CpuInfo> cpuInfoList = cpuInfoMapper.selectNewInfoByHour(ip);

        double cpuPercentSum = 0;
        for (CpuInfo cpuInfo : cpuInfoList) {
            cpuPercentSum += cpuInfo.getCpuPercent();
        }
        return cpuPercentSum / cpuInfoList.size();
    }
    /**
     * 获取最近1h的memory百分比平均值
     * @param ip
     * @return double
     */
    public double getAvgOfLastHourMemoryPercent(String ip){
        //获得物理机过去1h情况
        List<MemoryInfo> memoryInfoList = memoryInfoMapper.selectNewInfoByHour(ip);
        //得到平均数
        double memoryPercentSum = 0;
        for (MemoryInfo memoryInfo : memoryInfoList) {
            memoryPercentSum += memoryInfo.getMemoryPercent();
        }
       return memoryPercentSum / memoryInfoList.size();

    }
}
