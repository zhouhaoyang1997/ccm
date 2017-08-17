package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pojo.MemoryInfo;
import pojo.MemoryInfoExample;

public interface MemoryInfoMapper {

    List<MemoryInfo> selectNewInfoByHour(String ip);

    List<MemoryInfo> selectUpdateMemory(String ip);

    int countByExample(MemoryInfoExample example);

    int deleteByExample(MemoryInfoExample example);

    int insert(MemoryInfo record);

    int insertSelective(MemoryInfo record);

    List<MemoryInfo> selectByExample(MemoryInfoExample example);

    int updateByExampleSelective(@Param("record") MemoryInfo record, @Param("example") MemoryInfoExample example);

    int updateByExample(@Param("record") MemoryInfo record, @Param("example") MemoryInfoExample example);
}