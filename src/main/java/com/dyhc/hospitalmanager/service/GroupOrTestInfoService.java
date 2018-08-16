package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.GroupOrTestInfo;

/**
 * @author duxiaoyu
 * 单位分组和套餐关系业务
 */
public interface GroupOrTestInfoService {

    /**
     * 保存单位分组和套餐关系
     * @param groupOrTestInfo
     * @return
     */
    Integer addGroupOrTestInfoMapper(GroupOrTestInfo groupOrTestInfo);
}
