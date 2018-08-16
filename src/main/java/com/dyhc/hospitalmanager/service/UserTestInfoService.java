package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import org.apache.ibatis.annotations.Param;

public interface UserTestInfoService {
    /**
     * 通过体检项id查询用户信息
     */
    UserRegisterInfo selUserTestInfoById(String testNumber);
}
