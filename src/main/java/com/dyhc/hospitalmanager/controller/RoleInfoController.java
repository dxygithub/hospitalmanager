package com.dyhc.hospitalmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.pojo.RoleInfo;
import com.dyhc.hospitalmanager.service.RoleInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class RoleInfoController {

    @Resource(name = "roleInfoServiceImpl")
    private RoleInfoService roleInfoService;


    @RequestMapping(value = "/login.do")
    @ResponseBody
    public Object login(RoleInfo roleInfo){
        System.out.println(roleInfo.getRoleTypeId());
        System.out.println(roleInfo.getUserName());

        RoleInfo ro=roleInfoService.login(roleInfo.getUserName(),roleInfo.getPassword());
        if (ro!=null){
            if (ro.getRoleTypeId()==roleInfo.getRoleTypeId()){
                return JSON.toJSONString(ro.getRoleTypeId());
            }else {
                return JSON.toJSONString("您选择的科室错误！");
            }
        }else {
            return JSON.toJSONString("您的用户名或密码错误！");
        }
    }
}
