package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.Medical;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalService {
    /**
     * 根据体检项编号查询该项目
     * @param testNumber 项目项编号
     * @return
     */
    List<UserTestInfo> selMedicaltestNumber(String testNumber);
}
