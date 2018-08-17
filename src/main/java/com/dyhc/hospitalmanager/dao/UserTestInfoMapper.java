package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserTestInfoMapper {
    /**
     * 通过体检项id查询用户信息
     */
    UserRegisterInfo selUserTestInfoById(@Param("testNumber")String testNumber) throws Exception;
}

