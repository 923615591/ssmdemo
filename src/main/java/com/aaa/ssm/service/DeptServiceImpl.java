package com.aaa.ssm.service;

import com.aaa.ssm.dao.DeptDao;
import com.aaa.ssm.dao.EmpDao;
import com.aaa.ssm.entity.Dept;
import com.aaa.ssm.util.JedisClusterInterF;
import com.aaa.ssm.util.JedisDao;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
public class DeptServiceImpl implements  DeptService {

    @Autowired //依赖注入
    private DeptDao deptDao;

  /*  @Autowired
    private JedisDao jedisDao;*/

    //@Autowired
   // private JedisClusterInterF jedisClusterInterF;

    //@Transactional(propagation = Propagation.NOT_SUPPORTED)  //不需要事务支持
    @Override
    public List<Dept> getPage(Map map) {
      /*  Object depts = jedisClusterInterF.getObject("deptList");
        if(depts!=null){
            System.out.println("缓存中存在，从缓存中取。。。。。。。");
            return ((List<Dept>)depts);
        }else{
            System.out.println("缓存中不存在，从数据库取，放入缓存。。。。。。。");
            List<Dept> page = deptDao.getPage(map);
            jedisClusterInterF.putObject("deptList",page);
            return page;
        }*/
        return deptDao.getPage(map);
    }

}
