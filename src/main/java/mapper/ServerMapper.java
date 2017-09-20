package mapper;

import org.apache.ibatis.annotations.Param;
import vo.Server;
import vo.Vm;

import java.util.List;

/**
 * Created by 18236 on 2017/9/15.
 */
public interface ServerMapper {

    public List<Vm> getAllVoByServerIp(String serverIp);
}
