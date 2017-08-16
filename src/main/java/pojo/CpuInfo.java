package pojo;

public class CpuInfo {
    private String ipId;

    private Double time;

    private Double cpuUser;

    private Double cpuSystem;

    private Double cpuIdle;

    private Double cpuInterrupt;

    private Double cpuDpc;

    public String getIpId() {
        return ipId;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId == null ? null : ipId.trim();
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Double getCpuUser() {
        return cpuUser;
    }

    public void setCpuUser(Double cpuUser) {
        this.cpuUser = cpuUser;
    }

    public Double getCpuSystem() {
        return cpuSystem;
    }

    public void setCpuSystem(Double cpuSystem) {
        this.cpuSystem = cpuSystem;
    }

    public Double getCpuIdle() {
        return cpuIdle;
    }

    public void setCpuIdle(Double cpuIdle) {
        this.cpuIdle = cpuIdle;
    }

    public Double getCpuInterrupt() {
        return cpuInterrupt;
    }

    public void setCpuInterrupt(Double cpuInterrupt) {
        this.cpuInterrupt = cpuInterrupt;
    }

    public Double getCpuDpc() {
        return cpuDpc;
    }

    public void setCpuDpc(Double cpuDpc) {
        this.cpuDpc = cpuDpc;
    }
}