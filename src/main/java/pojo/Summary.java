package pojo;

public class Summary {
    private String ipId;

    private String cluster;

    private String serverIp;

    private Double bootTime;

    private Double cpuCount;

    private Double cpuLogical;

    public String getIpId() {
        return ipId;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId == null ? null : ipId.trim();
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster == null ? null : cluster.trim();
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    public Double getBootTime() {
        return bootTime;
    }

    public void setBootTime(Double bootTime) {
        this.bootTime = bootTime;
    }

    public Double getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(Double cpuCount) {
        this.cpuCount = cpuCount;
    }

    public Double getCpuLogical() {
        return cpuLogical;
    }

    public void setCpuLogical(Double cpuLogical) {
        this.cpuLogical = cpuLogical;
    }
}