package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.pojo.conditional.MedicalConditional;
import com.dyhc.hospitalmanager.service.MedicalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MedicalController {

    @Resource(name = "medicalServiceImpl")
    private MedicalService medicalService;

    @GetMapping("/getMadical")
    @ResponseBody
    public List<MedicalConditional> getMadical(String testNumber){
        return medicalService.getMadical(testNumber);
    }

    @GetMapping("/getCom")
    @ResponseBody
    public List<MedicalConditional> getCom(String testNumber){
        return medicalService.getCom(testNumber);
    }

    @GetMapping("/getPackage")
    @ResponseBody
    public List<MedicalConditional> getPackage(String testNumber){
        return medicalService.getPackage(testNumber);
    }
}
