package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.PackageMapper;
import com.dyhc.hospitalmanager.service.PackageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("packageServiceImpl")
public class PackageServiceImpl implements PackageService {

    @Resource(name = "packageMapper")
    private PackageMapper packageMapper;
}
