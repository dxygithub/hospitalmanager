package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.UserRegisterInfoService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserRegisterInfoController {

    @Resource(name = "userRegisterInfoServiceImpl")
    private UserRegisterInfoService userRegisterInfoService;
}
