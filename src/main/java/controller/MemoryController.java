package controller;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.MemoryInfo;
import service.MemoryService;

import java.util.List;

/**
 * Created by 18236 on 2017/8/16.
 */
@Controller
@RequestMapping("/memory")
public class MemoryController {
    @Autowired
    public MemoryService memoryService;

    @RequestMapping("/hour")
    @ResponseBody
    public List<MemoryInfo> getMemory(){
        //return memoryService.getMemory("169.254.226.220");
        return memoryService.getMemoryByHour("10.12.51.105");
    }

}
