package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CpuInfo;
import pojo.CpuInfoExample;

public interface CpuInfoMapper {
    int countByExample(CpuInfoExample example);

    int deleteByExample(CpuInfoExample example);

    int insert(CpuInfo record);

    int insertSelective(CpuInfo record);

    List<CpuInfo> selectByExample(CpuInfoExample example);

    int updateByExampleSelective(@Param("record") CpuInfo record, @Param("example") CpuInfoExample example);

    int updateByExample(@Param("record") CpuInfo record, @Param("example") CpuInfoExample example);
}