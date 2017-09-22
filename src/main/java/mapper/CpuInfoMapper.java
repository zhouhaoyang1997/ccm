package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pojo.CpuInfo;

import java.util.List;

public interface CpuInfoMapper {

    CpuInfo selectLastedCpuInfo(String ip);

    List<CpuInfo> selectNewInfoByHour(String ip);
    List<CpuInfo> selectCpuInfoByNumAndIp(@Param("ip") String ip, @Param("num") int num);

}