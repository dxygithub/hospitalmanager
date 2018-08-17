package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.conditional.MedicalConditional;

import java.util.List;

public interface MedicalService {

    /**
     * 获取用户的体检项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getMadical(String test_number);

    /**
     * 获取用户的套餐项下的体检项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getPackageMedical(String test_number);

    /**
     * 获取用户套餐项下的组合项的体检项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getPackageCom(String test_number);

    /**
     * 获取用户组合项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getCom(String test_number);

    /**
     * 根据用户编号查询该科室下的所有体检项
     * @param testNumber 用户编号
     * @param deskId 单位Id
     * @return
     */
    List<MedicalConditional> getUserDeskMedicalByTestNumber(String testNumber,String deskId);
}
