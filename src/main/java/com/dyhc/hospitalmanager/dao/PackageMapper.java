package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.Package;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PackageMapper {

    /**
     * 查询所有套餐
     * @return
     */
    List<Package> getpackageList();

    /**
     * 根据套餐id查询所有套餐
     * @param packageid 套餐id
     * @return
     */
    List<Package> getpackageById(@Param("packageid") Integer  packageid);
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
