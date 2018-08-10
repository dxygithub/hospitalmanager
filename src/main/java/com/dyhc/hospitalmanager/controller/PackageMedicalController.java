package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.PackageMedicalService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class PackageMedicalController {


    @Resource(name = "packageMedicalServiceImpl")
    private PackageMedicalService packageMedicalService;
}
