package service;

import mapper.ServerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.Server;

/**
 * Created by 18236 on 2017/9/15.
 */
@Service
public class ServerService {
    @Autowired
    public ServerMapper serverMapper;

    public Server getAllVo(String serverIp){
        return serverMapper.getAllVoByServerIp(serverIp);
    }
}
