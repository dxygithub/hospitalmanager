package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.DeskTypeMapper;
import com.dyhc.hospitalmanager.pojo.DeskType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesktypeTest {
    @Resource
    private DeskTypeMapper deskTypeMapper;
    DeskType deskType=null;
    @Test
    public  void  getById(){
        try {
            deskType=deskTypeMapper.getDeskTypeById(1);
            System.out.println(deskType.getDeskTypeName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  addDesktype(){
        DeskType deskType=new DeskType();
        deskType.setDeskTypeName("检查");
        try {
            int result=deskTypeMapper.addDesk_type(deskType);
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
    public  void  updDeskType(){
        DeskType deskType=new DeskType();
        deskType.setDeskTypeId(4);
        deskType.setDeskTypeName("总医生2");
        try {
            int result=deskTypeMapper.updDeskType(deskType);
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
            int result=deskTypeMapper.delDeskTypeById(4);
            if (result>0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
