package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.UserTestInfoMapper;
import com.dyhc.hospitalmanager.service.UserTestInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userTestInfoServiceImpl")
public class UserTestInfoServiceImpl implements UserTestInfoService {

    @Resource(name = "userTestInfoMapper")
    private UserTestInfoMapper userTestInfoMapper;
}
