package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.Medical;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author duxiaoyu
 * 体检项业务
 */
public interface MedicalService {

    /**
     * 根据体检项编号查询该项目
     * @param medicalId 项目项编号
     * @return
     */
    Medical selMedicalById(@Param("medicalId") String medicalId);
}
