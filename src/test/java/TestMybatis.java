import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.MemoryInfo;
import service.MemoryService;

import java.util.List;

/**
 * @author zhy
 * @create 2017-08-15 18:23
 **/
@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})

public class TestMybatis {
    @Autowired
    MemoryService memoryService;

    @Test
    public void test1() {
        List<MemoryInfo> list = memoryService.getMemoryTotal("192.168.231.1");
        for (MemoryInfo memoryInfo : list) {
            System.out.println(memoryInfo);
        }
    }
}
