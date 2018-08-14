package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.RoleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleInfoMapper {

    /**
     * 新增角色
     * @param roleInfo
     * @return
     */
    int addRoleInfo(RoleInfo roleInfo) throws Exception;

    /**
     * 修改角色信息
     * @param roleInfo
     * @return
     * @throws Exception
     */
    int updRoleInfo(RoleInfo roleInfo) throws Exception;

    /**
     * 获取所有角色信息
     * @return
     * @throws Exception
     */
    List<RoleInfo> getRoleInfoList() throws Exception;

    /**
     * 根据角色编号查询该角色
     * @param roleInfoId
     * @return
     * @throws Exception
     */
    RoleInfo getRoleInfoById(@Param("roleInfoId") Integer roleInfoId) throws Exception;

    /**
     * 根据用户名和密码查询该用户
     * @param userName
     * @param pwd
     * @return
     */
    RoleInfo login(@Param("userName") String userName,@Param("pwd") String pwd);
}
