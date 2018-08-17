package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.pojo.Medical;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import com.dyhc.hospitalmanager.pojo.conditional.MedicalConditional;
import com.dyhc.hospitalmanager.service.MedicalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MedicalController {

    @Resource(name = "medicalServiceImpl")
    private MedicalService medicalService;

    @RequestMapping(value = "/medical.do")
    @ResponseBody
    public Map<String, Object> getUserTestInfolist(String testNumber) {
        List<Medical> info = medicalService.selMedicaltestNumber(testNumber);
        for (Medical u: info) {
            if (u.getTestStatus()==0){
                u.setStatus("未检查");
            }else {
                u.setStatus("已检查");
            }
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "错误提示");
        map.put("data", info);

        return map;
    }

    @GetMapping("/getMadical")
    @ResponseBody
    public List<MedicalConditional> getMadical(String testNumber) {
        return medicalService.getMadical(testNumber);
    }

    @GetMapping("/getCom")
    @ResponseBody
    public List<MedicalConditional> getCom(String testNumber) {
        return medicalService.getCom(testNumber);
    }

    @GetMapping("/getPackage")
    @ResponseBody
    public List<MedicalConditional> getPackage(String testNumber) {
        return medicalService.getPackage(testNumber);
    }
}
