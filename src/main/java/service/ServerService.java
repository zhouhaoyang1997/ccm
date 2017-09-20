package service;

import mapper.ServerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.Server;
import vo.Vm;

import java.util.List;

/**
 * Created by 18236 on 2017/9/15.
 */
@Service
public class ServerService {
    @Autowired
    public ServerMapper serverMapper;

    public List<Vm> getAllVm(String serverIp){
        return serverMapper.getAllVoByServerIp(serverIp);
    }
}
