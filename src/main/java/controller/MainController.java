package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.VmService;
import vo.Vm;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    public VmService vmService;

    @RequestMapping("/vmDetail")
    public String vmDetail(String ipId, HttpServletRequest request){
        Vm vm = vmService.getLastedVm(ipId);
        request.setAttribute("vm",vm);
        return "vmDetail";
    }
}
