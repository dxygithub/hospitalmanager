package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.Medical;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MedicalMapper {

    /**
     * 根据科室id，查询该科室下的所有体检项
     * @param deskId
     * @return
     */
    List<Medical> SelMedicalByDeskId(@Param("deskId") String deskId) throws Exception;

    /**
     * 根据体检项编号查询该项目
     * @param medicalId 项目项编号
     * @return
     */
    Medical selMedicalById(@Param("medicalId") String medicalId) throws Exception;

    /**
     * 新增体检项
     * @param medical 体检项对象
     * @return
     */
    int addMedical(Medical medical) throws Exception;

    /**
     * 修改体检项
     * @param medical 体检项对象
     * @return
     */
    int updMedical(Medical medical) throws Exception;
}