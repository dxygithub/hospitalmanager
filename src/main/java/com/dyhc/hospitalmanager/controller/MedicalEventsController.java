package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.MedicalEventsService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class MedicalEventsController {

    @Resource(name = "medicalEventsServiceImpl")
    private MedicalEventsService medicalEventsService;
}
