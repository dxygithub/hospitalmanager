package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.UnitsGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author duxiaoyu
 * 单位分组维护业务
 */
public interface UnitsGroupService {

    /**
     * 根据单位编号查询所属的所有分组
     * @param unitsId 单位编号
     * @return
     */
    List<UnitsGroup> getUnitsGroupList(String unitsId);

    /**
     * 新增单位分组信息
     * @param unitsGroup
     * @return
     */
    int addUnitsGroup(UnitsGroup unitsGroup);

    /**
     * 修改单位分组信息
     * @param unitsGroup
     * @return
     */
    int updUnitsGroup(UnitsGroup unitsGroup);

    /**
     * 根据分组Id删除该分组
     * @param unitsGroupId
     * @return
     */
    int delUnitsGroup(String unitsGroupId);

    /**
     * 根据单位分组编号获取单位分组信息
     * @param unitsGroupId
     * @return
     */
    UnitsGroup getUnitsGroup(String unitsGroupId);

    /**
     * 获取最指定单位下的最后一个分组编号,并返回新的分组编号
     * @return
     */
    String getNewUbitsGroupId(String unitId);
}
