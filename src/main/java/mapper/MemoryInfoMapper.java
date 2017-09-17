package mapper;

import java.util.List;
import pojo.MemoryInfo;

public interface MemoryInfoMapper {
    List<MemoryInfo> selectNewInfoByHour(String ip);

    MemoryInfo selectLatestMemory(String ip);


}