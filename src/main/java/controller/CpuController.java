package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.CpuInfo;
import service.CpuService;

/**
 * Created by 18236 on 2017/8/19.
 */
@Controller
public class CpuController {

    @Autowired
    public CpuService cpuService;


    /**
     * 当前cpu信息
     * @param ip
     * @return
     */
    @RequestMapping("/cpu/current")
    @ResponseBody
    public CpuInfo getCurrentCpuInfo(String ip){
        return cpuService.getLastedCpuInfo(ip);
    }

}
