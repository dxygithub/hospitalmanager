package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.CombinationService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class CombinationController {

    @Resource(name = "combinationServiceImpl")
    private CombinationService combinationService;
}
