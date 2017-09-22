package service;

import mapper.NetInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.NetInfo;

import java.util.List;

@Service
public class NetService {

    @Autowired
    public NetInfoMapper netInfoMapper;

    /**
     * 获取最新的网络利用信息
     * @return
     */
    public NetInfo getNetInfo(String ipId){
        return netInfoMapper.selectLastedNetInfo(ipId);
    }



    public List<NetInfo> getNetInfoByNum(String ip,int num){
        return netInfoMapper.selectNetInfoByNumAndIp(ip,num);
    }
}
