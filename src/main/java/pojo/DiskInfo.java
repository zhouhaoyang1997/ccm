package pojo;

public class DiskInfo {
    private String ipId;

    private Double time;

    private Double diskTotal;

    private Double diskUsed;

    private Double diskFree;

    private Float diskPercent;

    private Double diskIoreadcount;

    private Double diskIowritecount;

    private Double diskIoreadbytes;

    private Double diskIowritebytes;

    private Double diskIoreadtime;

    private Double diskIowritetime;

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

    public Double getDiskTotal() {
        return diskTotal;
    }

    public void setDiskTotal(Double diskTotal) {
        this.diskTotal = diskTotal;
    }

    public Double getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(Double diskUsed) {
        this.diskUsed = diskUsed;
    }

    public Double getDiskFree() {
        return diskFree;
    }

    public void setDiskFree(Double diskFree) {
        this.diskFree = diskFree;
    }

    public Float getDiskPercent() {
        return diskPercent;
    }

    public void setDiskPercent(Float diskPercent) {
        this.diskPercent = diskPercent;
    }

    public Double getDiskIoreadcount() {
        return diskIoreadcount;
    }

    public void setDiskIoreadcount(Double diskIoreadcount) {
        this.diskIoreadcount = diskIoreadcount;
    }

    public Double getDiskIowritecount() {
        return diskIowritecount;
    }

    public void setDiskIowritecount(Double diskIowritecount) {
        this.diskIowritecount = diskIowritecount;
    }

    public Double getDiskIoreadbytes() {
        return diskIoreadbytes;
    }

    public void setDiskIoreadbytes(Double diskIoreadbytes) {
        this.diskIoreadbytes = diskIoreadbytes;
    }

    public Double getDiskIowritebytes() {
        return diskIowritebytes;
    }

    public void setDiskIowritebytes(Double diskIowritebytes) {
        this.diskIowritebytes = diskIowritebytes;
    }

    public Double getDiskIoreadtime() {
        return diskIoreadtime;
    }

    public void setDiskIoreadtime(Double diskIoreadtime) {
        this.diskIoreadtime = diskIoreadtime;
    }

    public Double getDiskIowritetime() {
        return diskIowritetime;
    }

    public void setDiskIowritetime(Double diskIowritetime) {
        this.diskIowritetime = diskIowritetime;
    }
}