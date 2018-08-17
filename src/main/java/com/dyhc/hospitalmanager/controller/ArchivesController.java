package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.ArchivesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ArchivesController {

    @Resource(name = "archivesServiceImpl")
    private ArchivesService archivesService;

    @GetMapping("getUserCheckCount")
    @ResponseBody
    public Integer getUserCheckCount(String testNumber){
        return archivesService.getUserCheckCount(testNumber);
    }
}
