package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.CostDetailService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class CostDetailController {

    @Resource(name = "costDetailServiceImpl")
    private CostDetailService costDetailService;
}
