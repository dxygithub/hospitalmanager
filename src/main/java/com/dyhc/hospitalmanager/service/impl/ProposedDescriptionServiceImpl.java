package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.ProposedDescriptionMapper;
import com.dyhc.hospitalmanager.service.ProposedDescriptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("proposedDescriptionServiceImpl")
public class ProposedDescriptionServiceImpl implements ProposedDescriptionService {

    @Resource(name = "proposedDescriptionMapper")
    private ProposedDescriptionMapper proposedDescriptionMapper;
}
