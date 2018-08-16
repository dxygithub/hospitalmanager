package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import com.dyhc.hospitalmanager.service.UserTestInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserTestInfoController {

    @Resource(name = "userTestInfoServiceImpl")
    private UserTestInfoService userTestInfoService;

    /**
     * 通过体检id查询用户信息
     * @param testNumber
     * @return
     */
    @RequestMapping(value = "userRegisterInfo.do")
    @ResponseBody
    public UserRegisterInfo getUserTestInfoById(String testNumber){
        UserRegisterInfo userRegisterInfo=userTestInfoService.selUserTestInfoById(testNumber);
        System.out.println(userRegisterInfo.getUserName());
        return  userRegisterInfo;
    }
}
