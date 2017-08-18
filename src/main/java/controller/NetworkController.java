package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.NetInfo;
import service.NetworkService;

import java.util.List;

/**
 * @author zhy
 * @create 2017-08-17 22:35
 **/
@Controller
@RequestMapping("/network")
public class NetworkController {
    @Autowired
    NetworkService networkService;
    @RequestMapping("/hour")
    @ResponseBody
    public List<NetInfo> getNetwork(){
        return networkService.getNetworkByHour("10.12.51.158");
    }
}
