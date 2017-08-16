package pojo;

public class NetInfo {
    private String ipId;

    private Double time;

    private Double netIobytessent;

    private Double netIobytesrecv;

    private Double netIopacketssent;

    private Double netIopacketsrecv;

    private Double netIoerrin;

    private Double netIoerrout;

    private Double netIodropin;

    private Double netIodropout;

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

    public Double getNetIobytessent() {
        return netIobytessent;
    }

    public void setNetIobytessent(Double netIobytessent) {
        this.netIobytessent = netIobytessent;
    }

    public Double getNetIobytesrecv() {
        return netIobytesrecv;
    }

    public void setNetIobytesrecv(Double netIobytesrecv) {
        this.netIobytesrecv = netIobytesrecv;
    }

    public Double getNetIopacketssent() {
        return netIopacketssent;
    }

    public void setNetIopacketssent(Double netIopacketssent) {
        this.netIopacketssent = netIopacketssent;
    }

    public Double getNetIopacketsrecv() {
        return netIopacketsrecv;
    }

    public void setNetIopacketsrecv(Double netIopacketsrecv) {
        this.netIopacketsrecv = netIopacketsrecv;
    }

    public Double getNetIoerrin() {
        return netIoerrin;
    }

    public void setNetIoerrin(Double netIoerrin) {
        this.netIoerrin = netIoerrin;
    }

    public Double getNetIoerrout() {
        return netIoerrout;
    }

    public void setNetIoerrout(Double netIoerrout) {
        this.netIoerrout = netIoerrout;
    }

    public Double getNetIodropin() {
        return netIodropin;
    }

    public void setNetIodropin(Double netIodropin) {
        this.netIodropin = netIodropin;
    }

    public Double getNetIodropout() {
        return netIodropout;
    }

    public void setNetIodropout(Double netIodropout) {
        this.netIodropout = netIodropout;
    }
}