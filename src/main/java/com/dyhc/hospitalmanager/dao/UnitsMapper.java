package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.Units;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UnitsMapper {

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
    int addUnits(Units units) throws Exception;

    /**
     * 修改
     * @param units
     * @return
     */
    int updUnits(Units units) throws Exception;

    /**
     * 根据单位编号，删除该单位
     * @param unitsId 单位id
     * @return
     */
    int delUnits(@Param("unitsId") String unitsId) throws Exception;
}
