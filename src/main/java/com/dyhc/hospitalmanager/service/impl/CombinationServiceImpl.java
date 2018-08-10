package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.CombinationMapper;
import com.dyhc.hospitalmanager.service.CombinationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("combinationServiceImpl")
public class CombinationServiceImpl implements CombinationService {

    @Resource(name = "combinationMapper")
    private CombinationMapper combinationMapper;
}
