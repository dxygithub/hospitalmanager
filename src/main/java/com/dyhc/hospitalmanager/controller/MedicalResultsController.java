package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.MedicalResultsService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class MedicalResultsController {

    @Resource(name = "medicalResultsServiceImpl")
    private MedicalResultsService medicalResultsService;
}
