package mapper;

import pojo.CpuInfo;

import java.util.List;

public interface CpuInfoMapper {

    CpuInfo selectLastedCpuInfo(String ip);

    List<CpuInfo> selectNewInfoByHour(String ip);
}