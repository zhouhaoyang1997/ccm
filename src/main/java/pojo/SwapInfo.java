package pojo;

public class SwapInfo {
    private String ipId;

    private Double time;

    private Double swapTotal;

    private Double swapUsed;

    private Double swapFree;

    private Double swapPercent;

    private Double swapSin;

    private Double swapSout;

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

    public Double getSwapTotal() {
        return swapTotal;
    }

    public void setSwapTotal(Double swapTotal) {
        this.swapTotal = swapTotal;
    }

    public Double getSwapUsed() {
        return swapUsed;
    }

    public void setSwapUsed(Double swapUsed) {
        this.swapUsed = swapUsed;
    }

    public Double getSwapFree() {
        return swapFree;
    }

    public void setSwapFree(Double swapFree) {
        this.swapFree = swapFree;
    }

    public Double getSwapPercent() {
        return swapPercent;
    }

    public void setSwapPercent(Double swapPercent) {
        this.swapPercent = swapPercent;
    }

    public Double getSwapSin() {
        return swapSin;
    }

    public void setSwapSin(Double swapSin) {
        this.swapSin = swapSin;
    }

    public Double getSwapSout() {
        return swapSout;
    }

    public void setSwapSout(Double swapSout) {
        this.swapSout = swapSout;
    }
}