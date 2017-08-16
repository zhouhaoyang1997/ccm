package service;

import pojo.MemoryInfo;

import java.util.List;

/**
 * @author zhy
 * @create 2017-08-15 18:35
 **/
public interface MemoryService {
    public List<MemoryInfo> getMemoryTotal(String ip);
}
