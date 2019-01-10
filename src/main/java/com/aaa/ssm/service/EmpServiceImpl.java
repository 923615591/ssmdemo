package com.aaa.ssm.service;

import com.aaa.ssm.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImpl
 * discriptoin:雇员服务实现类
 * author:zz
 * createTime:2018-11-07 15:15
 */
@Service //交给spring管理
@Transactional  //加上事务后，如果有异常，整个事务都会回滚
public class EmpServiceImpl implements  EmpService {

    @Autowired //依赖注入
    private EmpDao empDao;

    //@Transactional(propagation = Propagation.NOT_SUPPORTED)  //不需要事务支持
    @Override
    public List<Map> getPage(Map map) {
        //如果pageNo为空默认1  pageSize 为空,默认10
        int pageNo = map.get("pageNo")==null?1:Integer.valueOf(map.get("pageNo")+"");
        int pageSize = map.get("pageSize")==null?10:Integer.valueOf(map.get("pageSize")+"");
        //计算分页的开始值和结束值
        map.put("start",(pageNo-1)*pageSize);
        map.put("end",pageNo*pageSize+1);
        return empDao.getPage(map);
    }

    @Override
    public int getPageCount(Map map) {
        return empDao.getPageCount(map);
    }

    //@Transactional
    @Override
    public int add(Map map) {
        int add = empDao.add(map);
        System.out.println(1/0);
        System.out.println("返回的ID："+map.get("empNo"));
        return add;
    }
}
