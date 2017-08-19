package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.MemoryInfo;
import pojo.Summary;
import service.MainService;
import service.MemoryService;
import vo.MemoryUtilization;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by 18236 on 2017/8/16.
 */
@Controller
public class MemoryController {
    @Autowired
    public MemoryService memoryService;

    @Autowired
    public MainService mainService;


    @RequestMapping("/memory/detail")
    public String detail(String ip,HttpServletRequest req){
        HttpSession session = req.getSession();
        if(session.getAttribute("clusterAndServ")==null){
            Map<String,List<String>> clusterAndServ = mainService.getAllClusterAndServ();
            session.setAttribute("clusterAndServ",clusterAndServ);
        }
        Summary summary = mainService.getSummaryByIp(ip);
        req.setAttribute("vm",summary);
        return "memory";
    }

    @RequestMapping("/memory/current")
    @ResponseBody
    public MemoryUtilization getCurrentMemoryInfo(String ip){
        MemoryInfo memoryInfo = memoryService.getLastedMemoryInfo(ip);
        MemoryUtilization mu = new MemoryUtilization();
        mu.setUtilization(memoryInfo.getMemoryUsed()/memoryInfo.getMemoryTotal());
        return mu;
    }

    @RequestMapping("/memory/hour")
    @ResponseBody
    public List<MemoryInfo> getMemory(){
        //return memoryService.getMemory("169.254.226.220");
        return memoryService.getMemoryByHour("10.12.51.105");
    }

}
