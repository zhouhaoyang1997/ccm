package service;

import mapper.NetInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.NetInfo;

import java.util.List;

/**
 * @author zhy
 * @create 2017-08-17 22:08
 **/
@Service
public class NetworkService {
    @Autowired
    public NetInfoMapper netInfoMapper;

    public List<NetInfo> getNetworkByHour(String ip){return netInfoMapper.selectNewInfoByHour(ip);}

    /**
     * 获取当前net信息
     * @param ip
     * @return
     */
    public NetInfo getLastedNetInfo(String ip){
        return netInfoMapper.selectLastedNetInfo(ip).get(0);
    }
}
