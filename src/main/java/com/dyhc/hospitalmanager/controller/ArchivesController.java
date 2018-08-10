package com.dyhc.hospitalmanager.controller;

import com.dyhc.hospitalmanager.service.ArchivesService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class ArchivesController {

    @Resource(name = "archivesServiceImpl")
    private ArchivesService archivesService;
}
