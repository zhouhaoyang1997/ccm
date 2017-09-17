package mapper;

import vo.Server;

/**
 * Created by 18236 on 2017/9/15.
 */
public interface ServerMapper {

    public Server getAllVoByServerIp(String serverIp);
}
