package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.GroupOrTestInfoService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class GroupOrTestInfoController {

    @Resource(name = "groupOrTestInfoServiceImpl")
    private GroupOrTestInfoService groupOrTestInfoService;
}
