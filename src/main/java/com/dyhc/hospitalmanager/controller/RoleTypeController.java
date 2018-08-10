package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.RoleTypeService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class RoleTypeController {

    @Resource(name = "roleTypeServiceImpl")
    private RoleTypeService roleTypeService;
}
