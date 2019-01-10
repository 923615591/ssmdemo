package com.aaa.ssm.dao;

import java.util.List;
import java.util.Map;

/**
 * className:EmpDao
 * discriptoin:雇员持久层
 * author:zz
 * createTime:2018-11-07 14:58
 */
public interface EmpDao {

    /**
     * 雇员列表
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
