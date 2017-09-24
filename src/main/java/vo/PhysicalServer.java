package vo;

/**
 * @author zhy
 * @create 2017-09-21 23:03
 **/
public class PhysicalServer{

    double AvgOfLastHourCpuPercent;
    double AvgOfLastHourmemoryPercent;
    Vm maxCpuPercentVm;

    Vm maxMemoryPercentVm;
    String physicalServerName;
    String physicalServerIp;
    String cluster;

    public Vm getMaxCpuPercentVm() {
        return maxCpuPercentVm;
    }

    public void setMaxCpuPercentVm(Vm maxCpuPercentVm) {
        this.maxCpuPercentVm = maxCpuPercentVm;
    }

    public Vm getMaxMemoryPercentVm() {
        return maxMemoryPercentVm;
    }

    public void setMaxMemoryPercentVm(Vm maxMemoryPercentVm) {
        this.maxMemoryPercentVm = maxMemoryPercentVm;
    }

    public double getAvgOfLastHourCpuPercent() {
        return AvgOfLastHourCpuPercent;
    }

    public void setAvgOfLastHourCpuPercent(double avgOfLastHourCpuPercent) {
        AvgOfLastHourCpuPercent = avgOfLastHourCpuPercent;
    }

    public double getAvgOfLastHourmemoryPercent() {
        return AvgOfLastHourmemoryPercent;
    }

    public void setAvgOfLastHourmemoryPercent(double avgOfLastHourmemoryPercent) {
        AvgOfLastHourmemoryPercent = avgOfLastHourmemoryPercent;
    }
    public String getPhysicalServerName() {
        return physicalServerName;
    }

    public void setPhysicalServerName(String physicalServerName) {
        this.physicalServerName = physicalServerName;
    }

    public String getPhysicalServerIp() {
        return physicalServerIp;
    }

    public void setPhysicalServerIp(String physicalServerIp) {
        this.physicalServerIp = physicalServerIp;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    @Override
    public String toString() {
        return "PhysicalServer{" +
                "AvgOfLastHourCpuPercent=" + AvgOfLastHourCpuPercent +
                ", AvgOfLastHourmemoryPercent=" + AvgOfLastHourmemoryPercent +
                ", maxCpuPercentVm=" + maxCpuPercentVm +
                ", maxMemoryPercentVm=" + maxMemoryPercentVm +
                ", physicalServerName='" + physicalServerName + '\'' +
                ", physicalServerIp='" + physicalServerIp + '\'' +
                ", cluster='" + cluster + '\'' +
                '}';
    }
}
