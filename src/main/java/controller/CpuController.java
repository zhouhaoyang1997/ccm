package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.CpuInfo;
import service.CpuService;
import service.VmService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CpuController {

    @Autowired
    public CpuService cpuService;

    @Autowired
    public VmService vmService;

    @RequestMapping("/cpu/current")
    @ResponseBody
    public CpuInfo currentCpuInfo(String ip){
        return cpuService.getCpuInfo(ip);
    }


    @RequestMapping("/cpu")
    public String cpu(String ip, HttpServletRequest request){
        request.setAttribute("location",vmService.getLocation(ip));
        return "cpu";
    }

    @RequestMapping("/cpu/hour")
    @ResponseBody
    public List<CpuInfo> numCpuInfo(String ip){
        return cpuService.getCpuInfoByNum(ip,600);
    }

}
