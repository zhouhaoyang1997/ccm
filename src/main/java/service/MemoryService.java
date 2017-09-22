package service;

import mapper.MemoryInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.MemoryInfo;

import java.util.List;

@Service
public class MemoryService {

    @Autowired
    public MemoryInfoMapper memoryInfoMapper;

    /**
     * 获取最新的memory利用率
     * @return
     */
    public Double getMemoryPercent(String ipId){
        return memoryInfoMapper.selectLatestMemory(ipId).getMemoryPercent();
    }


    public List<MemoryInfo> getMemoryInfoByNum(String ip,int num){
        return memoryInfoMapper.selectMemoryInfoByNumAndIp(ip,num);
    }

}
