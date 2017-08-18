package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import pojo.NetInfo;
import pojo.NetInfoExample;

public interface NetInfoMapper {

    /**
     * 获取最新的一个网络信息
     * @param ip
     * @return
     */
    List<NetInfo> selectLastedNetInfo(String ip);

    List<NetInfo> selectNewInfoByHour(String ip);

    int countByExample(NetInfoExample example);

    int deleteByExample(NetInfoExample example);

    int insert(NetInfo record);

    int insertSelective(NetInfo record);

    List<NetInfo> selectByExample(NetInfoExample example);

    int updateByExampleSelective(@Param("record") NetInfo record, @Param("example") NetInfoExample example);

    int updateByExample(@Param("record") NetInfo record, @Param("example") NetInfoExample example);
}