package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.RoleInfoService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class RoleInfoController {

    @Resource(name = "roleInfoServiceImpl")
    private RoleInfoService roleInfoService;
}
