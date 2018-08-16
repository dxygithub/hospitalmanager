package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.MedicalMapper;
import com.dyhc.hospitalmanager.service.MedicalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("medicalServiceImpl")
public class MedicalServiceImpl implements MedicalService {

    @Resource(name = "medicalMapper")
    private MedicalMapper medicalMapper;
}
