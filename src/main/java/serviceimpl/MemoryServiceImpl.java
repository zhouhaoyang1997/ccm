package serviceimpl;

import mapper.MemoryInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.MemoryInfo;
import pojo.MemoryInfoExample;
import service.MemoryService;

import java.util.List;

/**
 * @author zhy
 * @create 2017-08-15 18:38
 **/
@Service
public class MemoryServiceImpl implements MemoryService {
    @Autowired
    MemoryInfoMapper memoryInfoMapper;

    @Override
    public List<MemoryInfo> getMemoryTotal(String ip) {
        MemoryInfoExample memoryInfoExample = new MemoryInfoExample();
        MemoryInfoExample.Criteria criteria = memoryInfoExample.createCriteria();
        criteria.andIpIdEqualTo(ip);
        return memoryInfoMapper.selectByExample(memoryInfoExample);
    }
}
