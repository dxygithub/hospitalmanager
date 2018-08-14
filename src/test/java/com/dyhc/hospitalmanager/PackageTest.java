package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.PackageMapper;
import com.dyhc.hospitalmanager.pojo.Package;
import com.dyhc.hospitalmanager.service.PackageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PackageTest {
    @Resource
    private PackageMapper packageMapper;

    @Test
    public  void insertPackage(){
       Package packages=new Package();
       packages.setPackageName("爱媳妇体检套餐");
       packages.setScopeApplication("媳妇");
       packages.setNote(null);
       packages.setIsEnable(0);
       int result=packageMapper.insertPackage(packages);
       if (result>0){
           System.out.println("新增成功");
       }else {
           System.out.println("新增失败");
       }
    }
    @Test
    public  void updPackage(){
        Package packages=new Package();
        packages.setPackageId(8);
        packages.setPackageName("爱媳妇体检套餐");
        packages.setScopeApplication("老公");
        packages.setNote(null);
        packages.setIsEnable(0);
        int result=packageMapper.updPackage(packages);
        if (result>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
    @Test
    public  void  delPackage(){
        Package p=new Package();
        p.setIsEnable(0);
        int result=packageMapper.delPackage(8);
        if (result>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改成功！");
        }
    }
}
