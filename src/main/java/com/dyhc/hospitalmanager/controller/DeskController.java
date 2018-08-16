package com.dyhc.hospitalmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.service.DeskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DeskController {

    @Resource(name = "deskServiceImpl")
    private DeskService deskService;

    @RequestMapping("/getAllDesk.do")
    @ResponseBody
    public Object getDesk() throws Exception{
        System.out.println(JSON.toJSONString(deskService.getDeskList()));
        return JSON.toJSONString(deskService.getDeskList());
    }
}
