package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.Units;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UnitsMapper {

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

    
}
