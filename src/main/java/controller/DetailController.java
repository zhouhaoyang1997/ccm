package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Summary;
import service.MainService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by 18236 on 2017/8/19.
 */
@Controller
public class DetailController {

    @Autowired
    public MainService mainService;

    @RequestMapping("/vmDetail")
    public String vmDetail(String ip,HttpServletRequest req){
        HttpSession session = req.getSession();
        if(session.getAttribute("clusterAndServ")==null){
            Map<String,List<String>> clusterAndServ = mainService.getAllClusterAndServ();
            session.setAttribute("clusterAndServ",clusterAndServ);
        }
        Summary summary = mainService.getSummaryByIp(ip);
        req.setAttribute("vm",summary);
        return "vmDetail";
    }

}
