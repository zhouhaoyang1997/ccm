package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.CpuInfo;
import service.CpuService;

@Controller
public class CpuController {

    @Autowired
    public CpuService cpuService;

    @RequestMapping("/cpu/current")
    @ResponseBody
    public CpuInfo currentCpuInfo(String ip){
        return cpuService.getCpuInfo(ip);
    }
}
