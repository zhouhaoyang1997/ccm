package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.MemoryInfo;

import java.util.List;

public interface MemoryInfoMapper {
    List<MemoryInfo> selectMemoryInfoByNumAndIp(@Param("ip") String ip,@Param("num") int num);

    MemoryInfo selectLatestMemory(@Param("ip") String ip);
    List<MemoryInfo> selectNewInfoByHour(@Param("ip") String ip);


}