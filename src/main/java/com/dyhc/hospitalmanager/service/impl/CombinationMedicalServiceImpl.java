package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.CombinationMedicalMapper;
import com.dyhc.hospitalmanager.service.CombinationMedicalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("combinationMedicalServiceImpl")
public class CombinationMedicalServiceImpl implements CombinationMedicalService {

    @Resource(name = "combinationMedicalMapper")
    private CombinationMedicalMapper combinationMedicalMapper;
}
