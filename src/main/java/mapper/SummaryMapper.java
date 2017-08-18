package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Summary;
import pojo.SummaryExample;

public interface SummaryMapper {

    //获取所有集群
    List<String> getAllCluster();

    //获取某个集群下的所有服务器
    List<String> getAllServByCluster(String cluster);

    int countByExample(SummaryExample example);

    int deleteByExample(SummaryExample example);

    int deleteByPrimaryKey(String ipId);

    int insert(Summary record);

    int insertSelective(Summary record);

    List<Summary> selectByExample(SummaryExample example);

    Summary selectByPrimaryKey(String ipId);

    int updateByExampleSelective(@Param("record") Summary record, @Param("example") SummaryExample example);

    int updateByExample(@Param("record") Summary record, @Param("example") SummaryExample example);

    int updateByPrimaryKeySelective(Summary record);

    int updateByPrimaryKey(Summary record);
}