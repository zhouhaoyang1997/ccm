package vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @create 2017-10-01 16:04
 **/
public class Migration {
    //高利用率cpu队列
    List<PhysicalServer> highCpuPercentList = new ArrayList<PhysicalServer>();
    //高利用率memory队列
    List<PhysicalServer> highMemoryPercentList=new ArrayList<PhysicalServer>();
    //低利用率cpu队列
    List<PhysicalServer>  lowCpuPercentList=new ArrayList<PhysicalServer>();
    //低利用率memory队列
    List<PhysicalServer>  lowMemoryPercentList=new ArrayList<PhysicalServer>();

    public List<PhysicalServer> getHighCpuPercentList() {
        return highCpuPercentList;
    }

    public void setHighCpuPercentList(List<PhysicalServer> highCpuPercentList) {
        this.highCpuPercentList = highCpuPercentList;
    }

    public List<PhysicalServer> getHighMemoryPercentList() {
        return highMemoryPercentList;
    }

    public void setHighMemoryPercentList(List<PhysicalServer> highMemoryPercentList) {
        this.highMemoryPercentList = highMemoryPercentList;
    }

    public List<PhysicalServer> getLowCpuPercentList() {
        return lowCpuPercentList;
    }

    public void setLowCpuPercentList(List<PhysicalServer> lowCpuPercentList) {
        this.lowCpuPercentList = lowCpuPercentList;
    }

    public List<PhysicalServer> getLowMemoryPercentList() {
        return lowMemoryPercentList;
    }

    public void setLowMemoryPercentList(List<PhysicalServer> lowMemoryPercentList) {
        this.lowMemoryPercentList = lowMemoryPercentList;
    }
}

