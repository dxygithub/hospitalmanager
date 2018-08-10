package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.UnitsMapper;
import com.dyhc.hospitalmanager.service.UnitsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("unitsServiceImpl")
public class UnitsServiceImpl implements UnitsService {

    @Resource(name = "unitsMapper")
    private UnitsMapper unitsMapper;
}
