package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.*;
import vo.Cluster;
import vo.Server;

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
        //用户登录后返回所有的集群和服务器,首次返回第一个集群的第一个物理机信息,及该物理机下的虚拟机列表
        if(userName.equals("adm")&&password.equals("123")){
            List<Cluster> clusters = new ArrayList<Cluster>(    );
            for(String s:clusterService.getAllCluster()){
                Cluster cluster = new Cluster();
                cluster.setCluster(s);
                cluster.setServerIp(clusterService.getAllServer(s));
                clusters.add(cluster);
            }
            HttpSession session = request.getSession();
            session.setAttribute("cluster",clusters);
            //首次返回第一个集群的第一个物理机信息,及该物理机下的虚拟机列表
            Server server = new Server();
            String serverIp = clusters.get(0).getServerIp().get(0);
            server.setServerIp(serverIp);
            server.setVm(serverService.getAllVm(serverIp));
            request.setAttribute("server",server);
            return "server";
        }else{
            return "login";
        }
    }

}
