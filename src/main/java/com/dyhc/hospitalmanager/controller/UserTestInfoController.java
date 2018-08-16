package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.UserTestInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class UserTestInfoController {

    @Resource(name = "userTestInfoServiceImpl")
    private UserTestInfoService userTestInfoService;
}
