package vo;

import pojo.Summary;

import java.util.List;

/**
 * Created by 18236 on 2017/8/17.
 * 用于显示虚拟机列表
 */
public class Server {
    private String cluster;
    private String server;
    private List<Vm> vm;

    public void setVm(List<Vm> vm) {
        this.vm = vm;
    }

    public List<Vm> getVm() {
        return vm;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
}
