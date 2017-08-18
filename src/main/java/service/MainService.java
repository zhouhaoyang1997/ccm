package service;

import mapper.CpuInfoMapper;
import mapper.MemoryInfoMapper;
import mapper.NetInfoMapper;
import mapper.SummaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 18236 on 2017/8/17.
 */
@Service
public class MainService {
        //查询集群，服务器信息
    @Autowired
    public SummaryMapper summaryMapper;

    @Autowired
    public CpuInfoMapper cpuInfoMapper;

    @Autowired
    public MemoryInfoMapper memoryInfoMapper;

    @Autowired
    public NetInfoMapper netInfoMapper;


    public CpuInfo getLastedCpuInfo(String ip){
        return cpuInfoMapper.selectLastedCpuInfo(ip).get(0);    //暂不考虑为空的问题
       // return cpuInfoMapper.selectLastedCpuInfo(ip)==null?null:cpuInfoMapper.selectLastedCpuInfo(ip).get(0);
    }

    public MemoryInfo getLastedMemoryInfo(String ip){
        return memoryInfoMapper.selectLatestMemory(ip).get(0);
    }

    public NetInfo getLastedNetInfo(String ip){
        return netInfoMapper.selectLastedNetInfo(ip).get(0);
    }

    /**
     * 获取所有集群
     * @return
     */
    public List<String> getAllClusterServ(){
        return summaryMapper.getAllCluster();
    }

    //拼接集群,服务器信息
    public Map<String,List<String>> getAllClusterAndServ(){
        Map<String,List<String>> clasterAndServ = new HashMap<>();
        List<String> clusters = getAllClusterServ();
        for(String s:clusters){
            clasterAndServ.put(s,summaryMapper.getAllServByCluster(s));
        }
        return clasterAndServ;
    }

    /**
     * 根据serverIp 获取当前服务器汇总信息
     * @param serverIp
     * @return
     */
    public List<Summary> getSummaryByIp(String serverIp){
        SummaryExample summaryExample = new SummaryExample();
        summaryExample.createCriteria().andServerIpEqualTo(serverIp);
        return summaryMapper.selectByExample(summaryExample);
    }
}
