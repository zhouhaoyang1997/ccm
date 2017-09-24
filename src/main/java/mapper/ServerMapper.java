package mapper;

import vo.PhysicalServer;
import vo.Vm;

import java.util.List;

/**
 * Created by 18236 on 2017/9/15.
 */
public interface ServerMapper {

    public List<Vm> getAllVoByServerIp(String serverIp);
    public List<PhysicalServer> getAllPhysicalServerByCluster(String cluster);
}
