package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.MedicalEventsMapper;
import com.dyhc.hospitalmanager.service.MedicalEventsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("medicalEventsServiceImpl")
public class MedicalEventsServiceImpl implements MedicalEventsService {

    @Resource(name = "medicalEventsMapper")
    private MedicalEventsMapper medicalEventsMapper;
}
