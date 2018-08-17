package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.UserTestInfoMapper;
import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import com.dyhc.hospitalmanager.service.UserTestInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userTestInfoServiceImpl")
public class UserTestInfoServiceImpl implements UserTestInfoService {

    @Resource(name = "userTestInfoMapper")
    private UserTestInfoMapper userTestInfoMapper;

    @Override
    public UserRegisterInfo selUserTestInfoById(String testNumber) {
        try {
            return userTestInfoMapper.selUserTestInfoById(testNumber);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
