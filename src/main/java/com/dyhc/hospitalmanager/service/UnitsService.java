package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.Units;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *单位信息维护业务
 */
public interface UnitsService {

    /**
     * 查询所有单位
     * @return
     */
    List<Units> getAllUnitsList();

    /**
     * 添加单位
     * @param units
     * @return
     */
    int addUnits(Units units);

    /**
     * 修改
     * @param units
     * @return
     */
    int updUnits(Units units);

    /**
     * 根据单位编号，删除该单位
     * @param unitsId 单位id
     * @return
     */
    int delUnits(@Param("unitsId") String unitsId);
}
