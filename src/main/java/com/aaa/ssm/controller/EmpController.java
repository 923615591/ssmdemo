package com.aaa.ssm.controller;

import com.aaa.ssm.service.EmpService;
import com.aaa.ssm.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * className:EmpController
 * discriptoin:
 * author:zz
 * createTime:2018-11-07 15:50
 */
@Controller
@RequestMapping("/emp")
public class EmpController {


    //依赖注入
    @Autowired
    private EmpService empService;
    /**
     * 雇员列表
     * @param map
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(@RequestParam Map map, Model model, HttpServletRequest request){
        map.put("pageSize",5);
       int pageNo = map.get("pageNo")==null?1:Integer.valueOf(map.get("pageNo")+"");
        String stringPage = new PageUtil(pageNo, 5, empService.getPageCount(map), request).getStringPage();
        model.addAttribute("stringPage",stringPage);
        model.addAttribute("empList",empService.getPage(map));
        return "emp/list";
    }

    /**
     * 跳转添加
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "emp/add";
    }

    /**
     * 模拟员工添加
     * @return
     */
    @ResponseBody
    @RequestMapping("add")
    public String add(){
        Map map = new HashMap();
        map.put("ename","zhangSan");
       return empService.add(map)+"";
    }
}
