package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.RoleInfoMapper;
import com.dyhc.hospitalmanager.pojo.RoleInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleInfoTest {
    @Resource
    private RoleInfoMapper roleInfoMapper;
    @Test
    public  void  addRoleInfo(){
        RoleInfo roleInfo=new RoleInfo();
        roleInfo.setRoleName("李四");
        roleInfo.setUserName("ls");
        roleInfo.setPassword("123");
        roleInfo.setDeskId("01");
        roleInfo.setRoleTypeId(3);
        try {
            int result=roleInfoMapper.addRoleInfo(roleInfo);
            if (result>0){
                System.out.println("新增成功!");
            }else {
                System.out.println("新增失败!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  updRoleInfo(){
        RoleInfo roleInfo=new RoleInfo();
        roleInfo.setRoleInfoId(7);
        roleInfo.setRoleName("王五");
        roleInfo.setUserName("ww");
        roleInfo.setPassword("123");
        roleInfo.setDeskId("01");
        roleInfo.setRoleTypeId(3);
        try {
            int result=roleInfoMapper.updRoleInfo(roleInfo);
            if (result>0){
                System.out.println("修改成功!");
            }else {
                System.out.println("修改失败!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    RoleInfo roleInfo=null;
    @Test
    public void  getRoleInfoById(){
        try {
            roleInfo=roleInfoMapper.getRoleInfoById(5);
            System.out.println(roleInfo.getRoleName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
