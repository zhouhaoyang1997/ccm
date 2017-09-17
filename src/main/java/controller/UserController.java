package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.NetInfo;
import service.*;
import vo.Cluster;
import vo.Server;
import vo.Vm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18236 on 2017/9/15.
 */
@Controller
public class UserController {

    @Autowired
    public ClusterService clusterService;

    @Autowired
    public ServerService serverService;

    @Autowired
    public CpuService cpuService;

    @Autowired
    public MemoryService memoryService;

    @Autowired
    public NetService netService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginJsp(){
        return "login";
    }

    /**
     * 用户登录后返回首页
     * @param userName
     * @param password
     * @param request
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String userName, String password, HttpServletRequest request){
        //用户登录后返回所有的集群和服务器,首次返回第一个集群的第一个服务器下的虚拟机信息
        List<Cluster> clusters = new ArrayList<>();
        for(String s:clusterService.getAllCluster()){
            Cluster cluster = new Cluster();
            cluster.setCluster(s);
            cluster.setServerIp(clusterService.getAllServer(s));
            clusters.add(cluster);
        }
        HttpSession session = request.getSession();
        session.setAttribute("cluster",clusters);
        //首页默认显示第一个服务器下的虚拟机信息
        Server server = serverService.getAllVo(clusters.get(0).getServerIp().get(0));
//        for(Vm vm:server.getVm()){
//            //设置该虚拟机的cpu利用率
//            vm.setCpuUtilization(cpuService.getCpuPercent(vm.getIpId()));
//            //设置该虚拟机的memory利用率
//            vm.setMemoryUtilization(memoryService.getMemoryPercent(vm.getIpId()));
//            //设置该虚拟机的net状况
//            NetInfo netInfo =netService.getNetInfo(vm.getIpId());
//            vm.setSent(netInfo.getNetIobytessent());
//            vm.setReceive(netInfo.getNetIobytesrecv());
//        }
        request.setAttribute("server",server);
        return "index";
    }

}
