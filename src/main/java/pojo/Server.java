package pojo;

/**
 * @author zhy
 * @create 2017-09-21 23:03
 **/
public class Server extends Summary{

    //不考虑网络
    CpuInfo cpuInfo;
    DiskInfo diskInfo;
    MemoryInfo memoryInfo;

    public CpuInfo getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(CpuInfo cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public DiskInfo getDiskInfo() {
        return diskInfo;
    }

    public void setDiskInfo(DiskInfo diskInfo) {
        this.diskInfo = diskInfo;
    }

    public MemoryInfo getMemoryInfo() {
        return memoryInfo;
    }

    public void setMemoryInfo(MemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

}
