package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.NetInfo;
import service.NetService;
import service.VmService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class NetController {
    @Autowired
    public NetService netService;

    @Autowired
    public VmService vmService;

    /**
     * 查询网络前20条数据
     * @param ip
     * @return
     */
    @RequestMapping("/net/current")
    @ResponseBody
    public List<NetInfo> currentNetInfo(String ip){
        return netService.getNetInfoByNum(ip,20);
    }

    @RequestMapping("/net")
    public String network(String ip, HttpServletRequest request){
        request.setAttribute("location",vmService.getLocation(ip));
        return "net";
    }

    /**
     * 查询前600条
     * @param ip
     * @return
     */
    @RequestMapping("/net/hour")
    @ResponseBody
    public List<NetInfo> numNetInfo(String ip){
        return netService.getNetInfoByNum(ip,600);
    }

}
