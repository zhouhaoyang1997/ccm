package pojo;

public class CpuInfo {
    private String ipId;

    private Double time;

    private Float cpuUser;

    private Float cpuSystem;

    private Float cpuIdle;

    private Float cpuPercent;

    private Float cpuInterrupt;

    private Float cpuDpc;

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

    public Float getCpuUser() {
        return cpuUser;
    }

    public void setCpuUser(Float cpuUser) {
        this.cpuUser = cpuUser;
    }

    public Float getCpuSystem() {
        return cpuSystem;
    }

    public void setCpuSystem(Float cpuSystem) {
        this.cpuSystem = cpuSystem;
    }

    public Float getCpuIdle() {
        return cpuIdle;
    }

    public void setCpuIdle(Float cpuIdle) {
        this.cpuIdle = cpuIdle;
    }

    public Float getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Float cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public Float getCpuInterrupt() {
        return cpuInterrupt;
    }

    public void setCpuInterrupt(Float cpuInterrupt) {
        this.cpuInterrupt = cpuInterrupt;
    }

    public Float getCpuDpc() {
        return cpuDpc;
    }

    public void setCpuDpc(Float cpuDpc) {
        this.cpuDpc = cpuDpc;
    }
}