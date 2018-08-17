package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.Medical;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.dyhc.hospitalmanager.pojo.conditional.MedicalConditional;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalService {
    /**
     * 通过体检编号获取体检项目
     */
    List<Medical> selMedicaltestNumber(String testNumber);

    /**
     * 获取用户的体检项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getMadical(String test_number);

    /**
     * 获取用户的套餐项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getPackage(String test_number);

    /**
     * 获取用户组合项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getCom(String test_number);

}

