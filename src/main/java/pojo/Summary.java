package pojo;

public class Summary {
    private String ipId;

    private String pcName;

    private String cluster;

    private String osPlatform;

    private String osVersion;

    private String architecture;

    private String machine;

    private String node;

    private String processor;

    private String serverIp;

    private Double bootTime;

    private int cpuCount;

    private int cpuLogical;

    private double memoryTotal;

    private double diskTotal;

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public void setCpuLogical(int cpuLogical) {
        this.cpuLogical = cpuLogical;
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

    public void setIpId(String ipId) {
        this.ipId = ipId == null ? null : ipId.trim();
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName == null ? null : pcName.trim();
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster == null ? null : cluster.trim();
    }

    public String getOsPlatform() {
        return osPlatform;
    }

    public void setOsPlatform(String osPlatform) {
        this.osPlatform = osPlatform == null ? null : osPlatform.trim();
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? null : osVersion.trim();
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture == null ? null : architecture.trim();
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine == null ? null : machine.trim();
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor == null ? null : processor.trim();
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
}