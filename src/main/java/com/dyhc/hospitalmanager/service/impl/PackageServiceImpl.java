package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.PackageMapper;
import com.dyhc.hospitalmanager.pojo.Package;
import com.dyhc.hospitalmanager.service.PackageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author duxiaoyu
 * 套餐信息维护业务实现
 */
@Service("packageServiceImpl")
public class PackageServiceImpl implements PackageService {

    @Resource(name = "packageMapper")
    private PackageMapper packageMapper;

    /**
     * 查询所有套餐
     * @return
     */
    public List<Package> getpackageList(){
        List<Package> packages=null;
        try {
            packages=this.packageMapper.getpackageList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return packages;
    }
}
