package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.CommonResultsMapper;
import com.dyhc.hospitalmanager.service.CommonResultsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("commonResultsServiceImpl")
public class CommonResultsServiceImpl implements CommonResultsService {

    @Resource(name = "commonResultsMapper")
    private CommonResultsMapper commonResultsMapper;
}
