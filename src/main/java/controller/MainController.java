package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.CpuInfo;
import pojo.MemoryInfo;
import pojo.NetInfo;
import pojo.Summary;
import service.CpuService;
import service.MainService;
import service.MemoryService;
import service.NetworkService;
import vo.Server;
import vo.Vm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhy
 * @create 2017-08-16 10:43
 **/
@Controller
public class MainController {

    @Autowired
    public MainService mainService;

    @Autowired
    public CpuService cpuService;

    @Autowired
    public MemoryService memoryService;

    @Autowired
    public NetworkService networkService;

    @RequestMapping("/index")
    public String test(HttpServletRequest req) {
        //请求到所有的集群,并获取该集群下的所有服务器

        HttpSession session = req.getSession();
        if(session.getAttribute("clusterAndServ")==null){
            Map<String,List<String>> clusterAndServ = mainService.getAllClusterAndServ();
            session.setAttribute("clusterAndServ",clusterAndServ);
        }

        return "index";
    }

    @RequestMapping("/net")
    public String test1() {
        return "net";
    }

    @RequestMapping("/server/vm")
    @ResponseBody
    public Server getCluster(String ip){
        Server server = new Server();
        List<Summary> summarys = mainService.getSummaryByServerIp(ip);
        if(summarys!=null){
            List<Vm> vms = new ArrayList<Vm>();
            for(Summary summary:summarys){
                Vm vm = new Vm();
                vm.setBootTime(summary.getBootTime());
                vm.setIpId(summary.getIpId());
                vm.setServerIp(summary.getServerIp());
                //计算内存利用率 used/total
                MemoryInfo memoryInfo = memoryService.getLastedMemoryInfo(summary.getIpId());
                vm.setMemoryUtilization(memoryInfo.getMemoryUsed()/memoryInfo.getMemoryTotal());
                //计算cpu利用率
                CpuInfo cpuInfo = cpuService.getLastedCpuInfo(summary.getIpId());
                vm.setCpuUtilization(0.6);//不知道怎么算......
                //net send and receive
                NetInfo netInfo = networkService.getLastedNetInfo(summary.getIpId());
                vm.setSent(netInfo.getNetIobytessent()/1024);
                vm.setReceive(netInfo.getNetIobytesrecv()/1024);
                vms.add(vm);
            }
            server.setVm(vms);
            server.setCluster(summarys.get(0).getCluster());
            server.setServer(summarys.get(0).getServerIp());
        }
        return server;
    }


}
