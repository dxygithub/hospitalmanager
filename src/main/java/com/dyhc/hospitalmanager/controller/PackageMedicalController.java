package com.dyhc.hospitalmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.pojo.PackageMedical;
import com.dyhc.hospitalmanager.service.PackageMedicalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PackageMedicalController {


    @Resource(name = "packageMedicalServiceImpl")
    private PackageMedicalService packageMedicalService;

    /**
     * 根据套餐获取所有体检项和组合项
     * @param packageId
     * @return
     */
    @RequestMapping("/getAllPackageMedical")
    @ResponseBody
    public String getAllPackageMedical(int packageId){
        List<PackageMedical> packageMedicals=this.packageMedicalService.getPackageInfoByPackageId(packageId);
        String json=JSON.toJSONString(packageMedicals);
        return json;
    }
}
