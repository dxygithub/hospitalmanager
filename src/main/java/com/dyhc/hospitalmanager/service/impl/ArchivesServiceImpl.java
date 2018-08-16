package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.ArchivesMapper;
import com.dyhc.hospitalmanager.service.ArchivesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("archivesServiceImpl")
public class ArchivesServiceImpl implements ArchivesService {

    @Resource(name = "archivesMapper")
    private ArchivesMapper archivesMapper;


    @Override
    public Integer getUserCheckCount(String testNumber) {
        Integer checkCount = 0;
        try {
            checkCount=archivesMapper.getUserCheckCount(testNumber);
            if(checkCount==null)
                checkCount=0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkCount;
    }
}
