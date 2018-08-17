package com.dyhc.hospitalmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.pojo.Package;
import com.dyhc.hospitalmanager.service.MedicalService;
import com.dyhc.hospitalmanager.service.PackageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author duxiaoyu
 * 套餐信息controller
 */
@Controller
public class PackageController {

    @Resource(name = "packageServiceImpl")
    private PackageService packageService;

    @Resource(name = "medicalServiceImpl")
    private MedicalService medicalService;

    /**
     *获取所有套餐信息
     * @return
     */
    @RequestMapping("/getAllpackage")
    @ResponseBody
    public String getAllpackage(){
        String json="";
        try {
            List<Package> packages=this.packageService.getpackageList();
            json=JSON.toJSONString(packages);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
