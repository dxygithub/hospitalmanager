package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.UnitsGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UnitsGroupMapper {

    /**
     * 根据单位编号查询所属的所有分组
     * @param unitsId 单位编号
     * @return
     */
    List<UnitsGroup> getUnitsGroupList(@Param("unitsId") String unitsId);

    /**
     * 新增单位分组信息
     * @param unitsGroup
     * @return
     */
    int addUnitsGroup(UnitsGroup unitsGroup) throws Exception;

    /**
     * 修改单位分组信息
     * @param unitsGroup
     * @return
     */
    int updUnitsGroup(UnitsGroup unitsGroup) throws Exception;

    /**
     * 根据分组Id删除该分组
     * @param unitsGroupId
     * @return
     */
    int delUnitsGroup(String unitsGroupId) throws Exception;
}