package com.dyhc.hospitalmanager.inspection;

import com.dyhc.hospitalmanager.util.HttpClinetTool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("aa.html")
    public String getResult(){
        return HttpClinetTool.get("010001");
    }
}