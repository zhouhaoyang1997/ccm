package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.NetInfo;
import service.NetService;

import java.util.List;

@Controller
public class NetController {
    @Autowired
    public NetService netService;

    @RequestMapping("/net/current")
    @ResponseBody
    public List<NetInfo> currentNetInfo(String ip){
        return netService.getNetInfoByNum(ip);
    }


}
