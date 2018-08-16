package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.PackageMedical;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author duxiaoyu
 * 套餐关系业务
 */
public interface PackageMedicalService {

    /**
     * 显示套餐表下边的组合项的下边的体检项以及基本体检项
     * @param packageId
     * @return
     */
    List<PackageMedical> getPackageInfoByPackageId(@Param("packageId") int packageId );
}
