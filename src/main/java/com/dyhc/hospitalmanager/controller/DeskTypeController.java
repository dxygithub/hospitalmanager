package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.DeskTypeService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class DeskTypeController {

    @Resource(name = "deskTypeServiceImpl")
    private DeskTypeService deskTypeService;
}
