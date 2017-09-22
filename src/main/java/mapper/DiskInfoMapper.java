package mapper;

import pojo.DiskInfo;

import java.util.List;

public interface DiskInfoMapper {
    List<DiskInfo> selectNewInfoByHour(String ip);
}