package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.MemoryService;

/**
 * @author zhy
 * @create 2017-08-16 10:43
 **/
@Controller
public class MainController {
    @Autowired
    MemoryService memoryService;

    @RequestMapping("/index")
    public String test() {
        return "fuck";
    }
}
