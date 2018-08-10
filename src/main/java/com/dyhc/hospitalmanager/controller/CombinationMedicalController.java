package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.CombinationMedicalService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class CombinationMedicalController {

    @Resource(name = "combinationMedicalServiceImpl")
    private CombinationMedicalService combinationMedicalService;
}
