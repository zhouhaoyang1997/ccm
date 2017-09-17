package service;

import mapper.CpuInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CpuService {

    @Autowired
    public CpuInfoMapper cpuInfoMapper;

    /**
     * 获取cpu最新利用率
     * @return
     */
    public Float getCpuPercent(String ipId){
        return cpuInfoMapper.selectLastedCpuInfo(ipId).getCpuPercent();
    }
}
