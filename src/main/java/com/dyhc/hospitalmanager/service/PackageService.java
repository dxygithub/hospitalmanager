package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.Package;

import java.util.List;

/**
 * @author duxiaoyu
 * 套餐信息维护业务
 */
public interface PackageService {

    /**
     * 查询所有套餐
     * @return
     */
    List<Package> getpackageList() throws Exception;
}
