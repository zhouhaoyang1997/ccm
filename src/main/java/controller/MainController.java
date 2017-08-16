package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhy
 * @create 2017-08-16 10:43
 **/
@Controller
public class MainController {

    @RequestMapping("/index")
    public String test() {
        return "index";
    }
}
