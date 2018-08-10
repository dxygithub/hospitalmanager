package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.UnitsService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UnitsController {

    @Resource(name = "unitsServiceImpl")
    private UnitsService unitsService;
}
