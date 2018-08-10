package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.DeskTypeMapper;
import com.dyhc.hospitalmanager.service.DeskTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("deskTypeServiceImpl")
public class DeskTypeServiceImpl implements DeskTypeService {

    @Resource(name = "deskTypeMapper")
    private DeskTypeMapper deskTypeMapper;
}
