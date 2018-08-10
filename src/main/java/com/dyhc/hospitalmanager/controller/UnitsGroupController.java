package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.UnitsGroupService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UnitsGroupController {

    @Resource(name = "unitsGroupServiceImpl")
    private UnitsGroupService unitsGroupService;
}
