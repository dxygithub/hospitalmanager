package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.CommonResultsService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class CommonResultsController {

    @Resource(name = "commonResultsServiceImpl")
    private CommonResultsService commonResultsService;
}
