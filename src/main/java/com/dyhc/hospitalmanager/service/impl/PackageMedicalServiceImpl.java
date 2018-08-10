package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.PackageMedicalMapper;
import com.dyhc.hospitalmanager.service.PackageMedicalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("packageMedicalServiceImpl")
public class PackageMedicalServiceImpl implements PackageMedicalService {

    @Resource(name = "packageMedicalMapper")
    private PackageMedicalMapper packageMedicalMapper;
}
