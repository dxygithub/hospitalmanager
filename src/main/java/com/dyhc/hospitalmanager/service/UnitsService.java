package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.Units;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *单位信息维护业务
 * @author duxiaoyu
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

    /**
     * 根据单位编号获取单位信息
     * @param uid
     * @return
     */
    Units getUnits(@Param("uid") String uid);

    /**
     * 获取最后一个单位编号
     * @return
     */
    String getUnitsNumber();

    /**
     * 根据单位编号，查询单位名称
     * @param unitsId 单位编号
     * @return
     * @throws Exception
     */
    String getUnitsName(String unitsId);
}
