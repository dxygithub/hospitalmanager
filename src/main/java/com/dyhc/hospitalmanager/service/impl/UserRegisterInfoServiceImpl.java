package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.UserRegisterInfoMapper;
import com.dyhc.hospitalmanager.service.UserRegisterInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userRegisterInfoServiceImpl")
public class UserRegisterInfoServiceImpl implements UserRegisterInfoService {

    @Resource(name = "userRegisterInfoMapper")
    private UserRegisterInfoMapper userRegisterInfoMapper;
}
