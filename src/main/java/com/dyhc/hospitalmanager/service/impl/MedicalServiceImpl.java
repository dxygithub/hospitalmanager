package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.MedicalMapper;
import com.dyhc.hospitalmanager.pojo.conditional.MedicalConditional;
import com.dyhc.hospitalmanager.service.MedicalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("medicalServiceImpl")
public class MedicalServiceImpl implements MedicalService {

    @Resource(name = "medicalMapper")
    private MedicalMapper medicalMapper;

    @Override
    public List<MedicalConditional> getMadical(String test_number) {
        try {
            return medicalMapper.getMadical(test_number);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<MedicalConditional> getPackage(String test_number) {
        try {
            return medicalMapper.getPackage(test_number);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<MedicalConditional> getCom(String test_number) {
        try {
            return medicalMapper.getCom(test_number);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
