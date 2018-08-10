package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.DeskService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class DeskController {

    @Resource(name = "deskServiceImpl")
    private DeskService deskService;
}
