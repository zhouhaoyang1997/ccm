package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pojo.MemoryInfo;

public interface MemoryInfoMapper {
    List<MemoryInfo> selectMemoryInfoByNumAndIp(@Param("ip") String ip,@Param("num") int num);

    MemoryInfo selectLatestMemory(@Param("ip") String ip);


}