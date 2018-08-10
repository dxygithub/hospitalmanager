package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.ProposedDescriptionService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class ProposedDescriptionController {

    @Resource(name = "proposedDescriptionServiceImpl")
    private ProposedDescriptionService proposedDescriptionService;
}
