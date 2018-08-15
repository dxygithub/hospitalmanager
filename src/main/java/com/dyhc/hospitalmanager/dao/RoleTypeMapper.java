package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.RoleType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleTypeMapper {

    /**
     * 新增角色类型
     * @param roleType 角色类型
     * @return
     * @throws Exception
     */
    int addRoleType(RoleType roleType)throws Exception;

    /**
     * 根据id查询角色类型
     * @param id
     * @return
     */
    RoleType  getById(@Param("roleId")Integer id)throws Exception;

    /**
     * 修改角色类型
     * @param roleType
     * @return
     * @throws Exception
     */
    int updRoleType(RoleType roleType)throws Exception;

    /**
     * 查询所有角色类型
     * @return
     * @throws Exception
     */
    List<RoleType> getAllRoleTypeList()throws Exception;

    /**
     * 删除角色类型
     * @param id
     * @return
     * @throws Exception
     */
    int delRoleTypeById(@Param("id")Integer id)throws Exception;
}
