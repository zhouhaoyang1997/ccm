package service;

import mapper.SummaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 18236 on 2017/9/15.
 */
@Service
public class ClusterService {
    @Autowired
    public SummaryMapper summaryMapper;

    public List<String> getAllCluster(){
          return summaryMapper.getAllCluster();
    }
    public List<String> getAllServer(String cluster){
        return summaryMapper.getAllServByCluster(cluster);
    }
}
