package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.*;
import vo.Migration;

/**
 * @author zhy
 * @create 2017-09-21 23:35
 **/
@Controller
public class MigrationController {
    @Autowired
    CpuService cpuService;
    @Autowired
    DiskService diskService;
    @Autowired
    MemoryService memoryService;
    @Autowired
    ServerService serverService;
    @Autowired
    MigrationService migrationService;
    @RequestMapping("/migrationList")
    @ResponseBody
    public Migration getMigrationList(String ClusterName) {
        return migrationService.getMigrationListByClusterName("ccc");
    }
}
