package vo;

/**
 * Created by 18236 on 2017/8/18.
 * 虚拟机实体
 */
public class Vm {
    private String ipId;

    private String serverIp;

    private Double cpuUtilization;   //  cpu利用率

    private Double memoryUtilization;    //内存利用率

    private Double sent;   //io发送

    private Double receive;   //io接收

    private Double bootTime;    //系统开机时间

    public String getIpId() {
        return ipId;
    }

    public String getServerIp() {
        return serverIp;
    }

    public Double getCpuUtilization() {
        return cpuUtilization;
    }

    public Double getMemoryUtilization() {
        return memoryUtilization;
    }

    public Double getSent() {
        return sent;
    }

    public Double getReceive() {
        return receive;
    }

    public Double getBootTime() {
        return bootTime;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public void setCpuUtilization(Double cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
    }

    public void setMemoryUtilization(Double memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
    }

    public void setSent(Double sent) {
        this.sent = sent;
    }

    public void setReceive(Double receive) {
        this.receive = receive;
    }

    public void setBootTime(Double bootTime) {
        this.bootTime = bootTime;
    }
}
