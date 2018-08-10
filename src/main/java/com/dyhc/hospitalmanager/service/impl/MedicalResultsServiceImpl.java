package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.MedicalResultsMapper;
import com.dyhc.hospitalmanager.service.MedicalResultsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("medicalResultsServiceImpl")
public class MedicalResultsServiceImpl implements MedicalResultsService {

    @Resource(name = "medicalResultsMapper")
    private MedicalResultsMapper medicalResultsMapper;
}
