package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.RoleTypeMapper;
import com.dyhc.hospitalmanager.pojo.RoleType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTypeTest {
    @Resource
    private RoleTypeMapper roleTypeMapper;
    @Test
    public  void  getAll(){
        try {
            List<RoleType>  roleTypeList=roleTypeMapper.getAllRoleTypeList();
            for (RoleType r:roleTypeList) {
                System.out.println(r.getRoleName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    RoleType roleType=null;
    @Test
    public  void getById(){
        try {
            roleType=roleTypeMapper.getById(1);
            System.out.println(roleType.getRoleName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void  addRoleType(){
        RoleType roleType=new RoleType();
        roleType.setRoleName("总医生");
        try {
            int result=roleTypeMapper.addRoleType(roleType);
            if (result>0){
                System.out.println("新增成功！");
            }else {
                System.out.println("新增失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void updDeskType(){
        RoleType roleType=new RoleType();
        roleType.setRoleId(6);
        roleType.setRoleName("总医生");
        try {
            int result=roleTypeMapper.updRoleType(roleType);
            if (result>0){
                System.out.println("修改成功！");
            }else {
                System.out.println("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  delDeskType(){
        try {
            int result=roleTypeMapper.delRoleTypeById(6);
            if (result>0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
