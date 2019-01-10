package com.aaa.ssm.service;

import java.util.List;
import java.util.Map;

/**
 * className:EmpService
 * discriptoin:雇员服务接口
 * author:zz
 * createTime:2018-11-07 15:10
 */
public interface EmpService {

    /**
     * 分页数据
     * @param map
     * @return
     */
    List<Map> getPage(Map map);

    /**
     * 分页总数量
     * @param map
     * @return
     */
    int getPageCount(Map map);
    /**
     * 员工添加
     * @param map
     * @return
     */
    int add(Map map);
}
