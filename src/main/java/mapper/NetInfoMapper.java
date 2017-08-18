package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.NetInfo;
import pojo.NetInfoExample;

import java.util.List;

public interface NetInfoMapper {
    int countByExample(NetInfoExample example);

    int deleteByExample(NetInfoExample example);

    int insert(NetInfo record);

    int insertSelective(NetInfo record);

    List<NetInfo> selectByExample(NetInfoExample example);

    int updateByExampleSelective(@Param("record") NetInfo record, @Param("example") NetInfoExample example);

    int updateByExample(@Param("record") NetInfo record, @Param("example") NetInfoExample example);

    List<NetInfo> selectNewInfoByHour(String ip);
}