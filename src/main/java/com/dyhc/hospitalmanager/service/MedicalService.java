package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.conditional.MedicalConditional;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalService {

    /**
     * 获取用户的体检项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getMadical(@Param("test_number") String test_number);

    /**
     * 获取用户的套餐项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getPackage(@Param("test_number")String test_number);

    /**
     * 获取用户组合项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getCom(@Param("test_number")String test_number);
}
