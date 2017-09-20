package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MemoryService;
import vo.MemoryUtilization;

@Controller
public class MemoryController {
    @Autowired
    public MemoryService memoryService;

    @RequestMapping("/memory/current")
    @ResponseBody
    public MemoryUtilization currentMemoryInfo(String ip){
        MemoryUtilization mu = new MemoryUtilization();
        mu.setUtilization(memoryService.getMemoryPercent(ip)/100);
        return mu;
    }
}
