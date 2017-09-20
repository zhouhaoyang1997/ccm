package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ServerService;
import service.VmService;
import vo.Cluster;
import vo.Server;
import vo.Vm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    public VmService vmService;

    @Autowired
    public ServerService serverService;

    /**
     * 返回虚拟机详情页
     * @param ipId
     * @param request
     * @return
     */
    @RequestMapping("/vmDetail")
    public String vmDetail(String ipId, HttpServletRequest request){
        Vm vm = vmService.getLastedVm(ipId);
        request.setAttribute("vm",vm);
        return "vm";
    }

    /**
     * 服务器主机详情页
     * @param serverIp
     * @param req
     * @return
     */
    @RequestMapping("/server")
    public String serverDetail(String serverIp,HttpServletRequest req){
        Server server = new Server();
        server.setVm(serverService.getAllVm(serverIp));
        server.setServerIp(serverIp);
        req.setAttribute("server",server);
        return "server";
    }


}
