package com.dyhc.hospitalmanager.inspection;

import com.dyhc.hospitalmanager.util.HttpClinetTool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetLis {

    @GetMapping("getLis")
    @ResponseBody
    public String getResult(String MedicalId){
        System.out.println(MedicalId);
        String content = HttpClinetTool.get(MedicalId);
        return content;
    }

}