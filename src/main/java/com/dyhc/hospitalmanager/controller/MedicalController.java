package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.MedicalService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class MedicalController {

    @Resource(name = "medicalServiceImpl")
    private MedicalService medicalService;
}
