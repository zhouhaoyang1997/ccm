package service;

import mapper.DiskInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.DiskInfo;

import java.util.List;

/**
 * @author zhy
 * @create 2017-09-21 23:47
 **/
@Service
public class DiskService {
    @Autowired
    public DiskInfoMapper diskInfoMapper;
    public List<DiskInfo> selectNewInfoByHour(String ip){return diskInfoMapper.selectNewInfoByHour(ip);}

}
