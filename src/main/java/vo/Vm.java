package vo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 18236 on 2017/8/18.
 * 虚拟机实体
 */
public class Vm {
    private String ipId;



    @Override
    public String toString() {
        return "Vm{" +
                "ipId='" + ipId + '\'' +
                ", serverIp='" + serverIp + '\'' +
                ", osPlatform='" + osPlatform + '\'' +
                ", pcName='" + pcName + '\'' +
                ", cpuPercent=" + cpuPercent +
                ", memoryPercent=" + memoryPercent +
                ", sent=" + sent +
                ", receive=" + receive +
                ", bootTime='" + bootTime + '\'' +
                ", cpuCount=" + cpuCount +
                ", memoryTotal=" + memoryTotal +
                ", diskTotal=" + diskTotal +
                '}';
    }

    private String serverIp;

    private String osPlatform;   //系统机型号

    private String pcName;  //主机名

    public String getOsPlatform() {
        return osPlatform;
    }

    public void setOsPlatform(String osPlatform) {
        this.osPlatform = osPlatform;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    private Float cpuPercent;   //  cpu利用率

    private Float memoryPercent;    //内存利用率

    private Double sent;   //io发送

    private Double receive;   //io接收

    private String bootTime;    //系统开机时间

    private int cpuCount;   //cpu个数

    private double memoryTotal; //memory总量

    private double diskTotal;   //硬盘总量

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public double getMemoryTotal() {
        return memoryTotal;
    }

    public void setMemoryTotal(double memoryTotal) {
        this.memoryTotal = memoryTotal;
    }

    public double getDiskTotal() {
        return diskTotal;
    }

    public void setDiskTotal(double diskTotal) {
        this.diskTotal = diskTotal;
    }

    public String getIpId() {
        return ipId;
    }

    public String getServerIp() {
        return serverIp;
    }


    public Float getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Float cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public Float getMemoryPercent() {
        return memoryPercent;
    }

    public void setMemoryPercent(Float memoryPercent) {
        this.memoryPercent = memoryPercent;
    }

    public Double getSent() {
        return sent;
    }

    public Double getReceive() {
        return receive;
    }

    public String getBootTime() {
        return bootTime;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }


    public void setSent(Double sent) {
        this.sent = sent;
    }

    public void setReceive(Double receive) {
        this.receive = receive;
    }

    public void setBootTime(Long bootTime) {
        Date date = new Date(bootTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.bootTime = sdf.format(date);
    }
}
