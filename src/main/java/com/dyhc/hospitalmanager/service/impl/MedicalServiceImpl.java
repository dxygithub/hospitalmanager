package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.MedicalMapper;
import com.dyhc.hospitalmanager.pojo.Medical;
import com.dyhc.hospitalmanager.service.MedicalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author duxiaoyu
 * 体检项业务实现
 */
@Service("medicalServiceImpl")
public class MedicalServiceImpl implements MedicalService {

    @Resource(name = "medicalMapper")
    private MedicalMapper medicalMapper;

    /**
     * 根据体检项编号查询该项目
     * @param medicalId 项目项编号
     * @return
     */
    public Medical selMedicalById(String medicalId) {
        Medical medical=null;
        try {
             medical=this.medicalMapper.selMedicalById(medicalId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medical;
    }
}
