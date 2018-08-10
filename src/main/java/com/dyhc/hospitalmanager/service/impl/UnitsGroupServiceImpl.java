package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.UnitsGroupMapper;
import com.dyhc.hospitalmanager.service.UnitsGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("unitsGroupServiceImpl")
public class UnitsGroupServiceImpl implements UnitsGroupService {


    @Resource(name = "unitsGroupMapper")
    private UnitsGroupMapper unitsGroupMapper;
}
