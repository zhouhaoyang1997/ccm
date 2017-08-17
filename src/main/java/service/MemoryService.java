package service;

import mapper.MemoryInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.MemoryInfo;
import pojo.MemoryInfoExample;

import java.util.List;

/**
 * Created by 18236 on 2017/8/16.
 */
@Service
public class MemoryService {

    @Autowired
    public MemoryInfoMapper memoryInfoMapper;

    //查取当前ip信息
    public List<MemoryInfo> getMemory(String ip){
        MemoryInfoExample mie = new MemoryInfoExample();
        mie.createCriteria().andIpIdEqualTo(ip);
        return memoryInfoMapper.selectByExample(mie);
    }
    public List<MemoryInfo> getMemoryByHour(String ip){
        return memoryInfoMapper.selectNewInfoByHour(ip);
    }

    public List<MemoryInfo> getUpdateMemory(String ip){
        return memoryInfoMapper.selectUpdateMemory(ip);
    }
}
