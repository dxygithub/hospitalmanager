package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.CostDetailMapper;
import com.dyhc.hospitalmanager.service.CostDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("costDetailServiceImpl")
public class CostDetailServiceImpl implements CostDetailService {

    @Resource(name = "costDetailMapper")
    private CostDetailMapper costDetailMapper;;
}
