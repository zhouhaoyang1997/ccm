package service;

import mapper.VmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.Vm;

@Service
public class VmService {
    @Autowired
    public VmMapper vmMapper;

    public Vm getLastedVm(String ipId){
        return vmMapper.getLastedVm(ipId);
    }
}
