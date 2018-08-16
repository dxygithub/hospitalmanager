package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.pojo.Medical;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import com.dyhc.hospitalmanager.service.MedicalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MedicalController {

    @Resource(name = "medicalServiceImpl")
    private MedicalService medicalService;
    @RequestMapping(value = "medical.do")
    @ResponseBody
    public List<UserTestInfo> getMedicallist(String testNumber){
        List<UserTestInfo> medicalList=medicalService.selMedicaltestNumber(testNumber);
        for (UserTestInfo u: medicalList) {
            System.out.println(u.getMedical().getProjectName());
        }
        return medicalList;
    }
}
