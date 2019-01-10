package com.aaa.ssm.service;

import com.aaa.ssm.entity.Dept;

import java.util.List;
import java.util.Map;

/**
 * className:EmpService
 * discriptoin:雇员服务接口
 * author:zz
 * createTime:2018-11-07 15:10
 */
public interface DeptService {

    /**
     * 分页数据
     * @param map
     * @return
     */
    List<Dept> getPage(Map map);


}
