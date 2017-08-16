package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pojo.DiskInfo;
import pojo.DiskInfoExample;

public interface DiskInfoMapper {
    int countByExample(DiskInfoExample example);

    int deleteByExample(DiskInfoExample example);

    int insert(DiskInfo record);

    int insertSelective(DiskInfo record);

    List<DiskInfo> selectByExample(DiskInfoExample example);

    int updateByExampleSelective(@Param("record") DiskInfo record, @Param("example") DiskInfoExample example);

    int updateByExample(@Param("record") DiskInfo record, @Param("example") DiskInfoExample example);
}