package com.dyhc.hospitalmanager.service;

import org.apache.ibatis.annotations.Param;

public interface ArchivesService {

    /**
     * 根据用户编号，查询该用户的检查记录
     * @param testNumber
     * @return
     * @throws Exception
     */
    Integer getUserCheckCount(String testNumber);
}
