package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.UnitsMapper;
import com.dyhc.hospitalmanager.pojo.Units;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitsTest {
    @Resource
    private UnitsMapper unitsMapper;
    @Test
    public  void  getAllUnitsList(){
        List<Units> unitsList =unitsMapper.getAllUnitsList();
        for (Units u: unitsList) {
            System.out.println(u.getUnitsPrincipal());
        }
    }
    @Test
    public  void addUnits(){
        Units units =new Units();
        units.setUnitsId("0005");
        units.setUnitsName("科技大学");
        units.setSpellCode("kjdx");
        units.setUnitsPrincipal("王海");
        units.setTelephone("17635697252");
        units.setPostalCode("037400");
        units.setAddress("山西太原");
        units.setBusinessBank("邮政");
        units.setBankNumber("11212121");
        units.setCompanyNature("自营");
        units.setAuthorizedNumber(123);
        units.setRemark("aaa");
        units.setIsdelete(1);
        units.setCreateBy(1);
        units.setCreateTime(null);
        units.setModifyBy(1);
        units.setModifyTime(null);
        try {
            int result=unitsMapper.addUnits(units);
            if (result>0){
                System.out.println("新增成功！");
            }else {
                System.out.println("新增失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public  void  updUnits(){
        Units units =new Units();
        units.setUnitsId("0005");
        units.setUnitsName("北京大学");
        units.setSpellCode("bjdx");
        units.setUnitsPrincipal("王海");
        units.setTelephone("17635697252");
        units.setPostalCode("037400");
        units.setAddress("山西太原");
        units.setBusinessBank("邮政");
        units.setBankNumber("11212121");
        units.setCompanyNature("国企");
        units.setAuthorizedNumber(123);
        units.setRemark("aaa");
        units.setIsdelete(1);
        units.setCreateBy(1);
        units.setCreateTime(null);
        units.setModifyBy(1);
        units.setModifyTime(null);
        try {
            int result=unitsMapper.updUnits(units);
            if (result>0){
                System.out.println("修改成功！");
            }else {
                System.out.println("修改失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  delUnits(){
        Units units=new Units();
        units.setIsdelete(0);
        int result= 0;
        try {
            result = unitsMapper.delUnits("0003");
            if (result>0){
                System.out.println("修改成功！");
            }else {
                System.out.println("修改失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
