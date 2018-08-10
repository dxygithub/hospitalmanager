package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.PackageService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class PackageController {

    @Resource(name = "packageServiceImpl")
    private PackageService packageService;
}
