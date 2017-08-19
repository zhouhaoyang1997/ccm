package service;

import mapper.CpuInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.CpuInfo;

/**
 * Created by 18236 on 2017/8/19.
 */
@Service
public class CpuService {

    @Autowired
    public CpuInfoMapper cpuInfoMapper;

    /**
     * 获取当前cpu信息
     * @return
     */
    public CpuInfo getLastedCpuInfo(String ip){
        return cpuInfoMapper.selectLastedCpuInfo(ip).get(0);    //暂不考虑为空的问题
        // return cpuInfoMapper.selectLastedCpuInfo(ip)==null?null:cpuInfoMapper.selectLastedCpuInfo(ip).get(0);
    }
}
