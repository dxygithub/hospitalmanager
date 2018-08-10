package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.RoleTypeMapper;
import com.dyhc.hospitalmanager.service.RoleTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("roleTypeServiceImpl")
public class RoleTypeServiceImpl implements RoleTypeService {

    @Resource(name = "roleTypeMapper")
    private RoleTypeMapper roleTypeMapper;
}
