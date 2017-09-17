package vo;

import java.util.List;

/**
 * 集群实体
 * Created by 18236 on 2017/9/15.
 */
public class Cluster {
    private String cluster;

    private List<String> serverIp;

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public List<String> getServerIp() {
        return serverIp;
    }

    public void setServerIp(List<String> serverIp) {
        this.serverIp = serverIp;
    }
}
