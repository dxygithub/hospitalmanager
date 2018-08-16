package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.GroupOrTestInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GroupOrTestInfoMapper {

    /**
     * 保存单位分组和套餐关系
     * @param groupOrTestInfo
     * @return
     */
    Integer addGroupOrTestInfoMapper(GroupOrTestInfo groupOrTestInfo) throws Exception;
}
