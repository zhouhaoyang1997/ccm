package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pojo.CpuInfo;

public interface CpuInfoMapper {

    CpuInfo selectLastedCpuInfo(String ip);

    List<CpuInfo> selectCpuInfoByNumAndIp(@Param("ip") String ip, @Param("num") int num);

}