package com.aaa.ssm.dao;

import com.aaa.ssm.entity.Dept;

import java.util.List;
import java.util.Map;

/**
 * className:EmpDao
 * discriptoin: 部门持久层
 * author:zz
 * createTime:2018-11-07 14:58
 */
public interface DeptDao {

    /**
     * 部门列表
     * @return
     */
    List<Dept> getPage(Map map);

}
