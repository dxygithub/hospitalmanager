package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.RoleInfo;
import org.apache.ibatis.annotations.Param;

public interface RoleInfoService {

    /**
     * 根据用户名和密码查询该用户
     * @param userName
     * @param pwd
     * @return
     */
    RoleInfo login(@Param("userName") String userName, @Param("pwd") String pwd);

    /**
     * 管理员登录
     * @param userName
     * @param pwd
     * @return
     * @throws Exception
     */
    RoleInfo loginAdmin(@Param("userName") String userName, @Param("pwd") String pwd);
}
