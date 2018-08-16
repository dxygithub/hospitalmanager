package com.dyhc.hospitalmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.pojo.RoleInfo;
import com.dyhc.hospitalmanager.service.RoleInfoService;
import com.dyhc.hospitalmanager.util.Commons;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class RoleInfoController {

    @Resource(name = "roleInfoServiceImpl")
    private RoleInfoService roleInfoService;


    @RequestMapping(value = "/login.do")
    @ResponseBody
    public Object login(RoleInfo roleInfo, HttpSession session){
        RoleInfo ro=roleInfoService.login(roleInfo.getUserName(),roleInfo.getPassword());
        if (ro!=null){
            String loginStr = Commons.loginRoleInfo.toString();
            session.setAttribute(loginStr,ro);
            if (ro.getRoleTypeId()==roleInfo.getRoleTypeId()){
                return JSON.toJSONString(ro.getRoleTypeId());
            }else {
                return JSON.toJSONString("您选择的科室错误！");
            }
        }else {
            return JSON.toJSONString("您的用户名或密码错误！");
        }
    }

    /**
     * 获取用户登录后的对象
     * @return
     */
    @RequestMapping("getLoginRole.do")
    @ResponseBody
    public RoleInfo getLoginRole(HttpSession session){
        String loing = Commons.loginRoleInfo.toString();
        System.out.println(loing);
        RoleInfo roleInfo = (RoleInfo)session.getAttribute(loing);
        return roleInfo;
    }
}
