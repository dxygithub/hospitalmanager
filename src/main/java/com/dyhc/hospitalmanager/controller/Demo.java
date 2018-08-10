package com.dyhc.hospitalmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该类只作为测试类，正式开发时，请删除该类
 * @author duxiaoyu
 */
@Controller
public class Demo {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
