package com.aaa.ssm.controller;

import com.aaa.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * className:DeptController
 * discriptoin:
 * author:zz
 * createTime:2018-12-29 17:07
 */
@Controller
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("toList")
    public String toList(){
       return "dept/list";
    }
    /**
     * 返回部门列表
     * @return
     */
    @ResponseBody
    @RequestMapping("list")
    public Object list(){
        return deptService.getPage(null);
    }
}
