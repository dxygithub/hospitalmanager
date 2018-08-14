package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.Package;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PackageMapper {

    /**
     * 新增套餐
     * @param p
     * @return
     */
    int insertPackage(Package p) throws Exception;

    /**
     * 修改套餐
     * @param p
     * @return
     */
    int updPackage(Package p) throws Exception;

    /**
     * 根据套餐Id，删除该套餐
     * @param PackageId
     * @return
     */
    int delPackage(Integer PackageId) throws Exception;


}
