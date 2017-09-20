package service;

import mapper.CpuInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.CpuInfo;

@Service
public class CpuService {

    @Autowired
    public CpuInfoMapper cpuInfoMapper;

    /**
     * 获取cpu最新Cpu状态
     * @return
     */
    public CpuInfo getCpuInfo(String ipId){
        return cpuInfoMapper.selectLastedCpuInfo(ipId);
    }
}
