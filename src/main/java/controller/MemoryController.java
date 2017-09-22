package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.MemoryInfo;
import pojo.NetInfo;
import service.MemoryService;
import service.VmService;
import vo.MemoryUtilization;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MemoryController {
    @Autowired
    public MemoryService memoryService;

    @Autowired
    public VmService vmService;

    @RequestMapping("/memory/current")
    @ResponseBody
    public MemoryUtilization currentMemoryInfo(String ip){
        MemoryUtilization mu = new MemoryUtilization();
        mu.setUtilization(memoryService.getMemoryPercent(ip)/100);
        return mu;
    }

    @RequestMapping("/memory")
    public String memory(String ip, HttpServletRequest request){
        request.setAttribute("location",vmService.getLocation(ip));
        return "memory";
    }

    /**
     * 查询前600条
     * @param ip
     * @return
     */
    @RequestMapping("/memory/hour")
    @ResponseBody
    public List<MemoryInfo> numMemoryInfo(String ip){
        return memoryService.getMemoryInfoByNum(ip,600);
    }
}
