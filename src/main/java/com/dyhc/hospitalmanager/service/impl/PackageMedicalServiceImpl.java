package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.PackageMedicalMapper;
import com.dyhc.hospitalmanager.pojo.PackageMedical;
import com.dyhc.hospitalmanager.service.PackageMedicalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @author duxiaoyu
 * 套餐关系业务实现
 */
@Service("packageMedicalServiceImpl")
public class PackageMedicalServiceImpl implements PackageMedicalService {

    @Resource(name = "packageMedicalMapper")
    private PackageMedicalMapper packageMedicalMapper;

    /**
     * 显示套餐表下边的组合项的下边的体检项以及基本体检项
     * @param packageId
     * @return
     */
    public List<PackageMedical> getPackageInfoByPackageId(int packageId) {
        List<PackageMedical> packageMedicals=null;
        try {
            packageMedicals=this.packageMedicalMapper.getPackageInfoByPackageId(packageId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return packageMedicals;
    }
}
