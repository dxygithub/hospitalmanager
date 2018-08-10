package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.GroupOrTestInfoMapper;
import com.dyhc.hospitalmanager.service.GroupOrTestInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("groupOrTestInfoServiceImpl")
public class GroupOrTestInfoServiceImpl implements GroupOrTestInfoService {

    @Resource(name = "groupOrTestInfoMapper")
    private GroupOrTestInfoMapper groupOrTestInfoMapper;
}
