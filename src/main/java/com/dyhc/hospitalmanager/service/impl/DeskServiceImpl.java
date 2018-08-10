package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.DeskMapper;
import com.dyhc.hospitalmanager.service.DeskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("deskServiceImpl")
public class DeskServiceImpl implements DeskService {

    @Resource(name = "deskMapper")
    private DeskMapper deskMapper;
}
