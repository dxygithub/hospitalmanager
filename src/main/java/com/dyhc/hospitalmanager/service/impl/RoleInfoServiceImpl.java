package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.RoleInfoMapper;
import com.dyhc.hospitalmanager.service.RoleInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("roleInfoServiceImpl")
public class RoleInfoServiceImpl implements RoleInfoService {

    @Resource(name = "roleInfoMapper")
    private RoleInfoMapper roleInfoMapper;
}
