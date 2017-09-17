package mapper;

import java.util.List;
import pojo.CpuInfo;

public interface CpuInfoMapper {

    CpuInfo selectLastedCpuInfo(String ip);


}