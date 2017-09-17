package mapper;

import java.util.List;

public interface SummaryMapper {

    //获取所有集群
    List<String> getAllCluster();

    //获取某个集群下的所有服务器
    List<String> getAllServByCluster(String cluster);
}