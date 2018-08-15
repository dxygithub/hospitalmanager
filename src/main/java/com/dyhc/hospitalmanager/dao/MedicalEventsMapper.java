package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.MedicalEvents;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MedicalEventsMapper {

    /**
     * 修改体检明细
     * @param medicalEvents
     * @return
     */
    int updMedicalEvents(MedicalEvents medicalEvents) throws Exception;

    /**
     * 根据体检项查询体检明细
     * @param medicalId 体检项id
     * @return
     */
    MedicalEvents selMedicalEventsByTestId(@Param("medicalId") String medicalId) throws Exception;
}