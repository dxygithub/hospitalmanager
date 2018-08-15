package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.UnitsGroupMapper;
import com.dyhc.hospitalmanager.pojo.UnitsGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitsGroupTest {
    @Resource
    private UnitsGroupMapper unitsGroupMapper;
    @Test
    public  void getUnitsGroupList(){
        List<UnitsGroup>  unitsGroupList=unitsGroupMapper.getUnitsGroupList("000202");
        for (UnitsGroup u: unitsGroupList) {
            System.out.println(u.getGroupName());
        }
    }
    @Test
    public void  addUnitsGroup(){
        UnitsGroup unitsGroup= new UnitsGroup();
        unitsGroup.setUnitsGroupId("000404");
        unitsGroup.setGroupName("C组");
        unitsGroup.setUnitsId("0004");
        unitsGroup.setSexCondition("男");
        unitsGroup.setMaritalCondition("已婚");
        unitsGroup.setAgeUpperLimit(18);
        unitsGroup.setAgeLowerLimit(20);
        unitsGroup.setDutyCondition("舞蹈系");
        unitsGroup.setCreateBy(1);
        unitsGroup.setCreateTime(null);
        unitsGroup.setModifyBy(1);
        unitsGroup.setModifuTime(null);
        unitsGroup.setIsdelete(1);
        try {
            int result=unitsGroupMapper.addUnitsGroup(unitsGroup);
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
    public  void updUnitsGroup(){
        UnitsGroup unitsGroup= new UnitsGroup();
        unitsGroup.setUnitsGroupId("000404");
        unitsGroup.setGroupName("D组");
        unitsGroup.setUnitsId("0005");
        unitsGroup.setSexCondition("女");
        unitsGroup.setMaritalCondition("已婚");
        unitsGroup.setAgeUpperLimit(18);
        unitsGroup.setAgeLowerLimit(20);
        unitsGroup.setDutyCondition("舞蹈系");
        unitsGroup.setCreateBy(1);
        unitsGroup.setCreateTime(null);
        unitsGroup.setModifyBy(1);
        unitsGroup.setModifuTime(null);
        unitsGroup.setIsdelete(1);
        try {
            int result=unitsGroupMapper.updUnitsGroup(unitsGroup);
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
    public  void  delUnitsGroup(){
        UnitsGroup unitsGroup=new UnitsGroup();
        unitsGroup.setIsdelete(0);
        int result= 0;
        try {
            result = unitsGroupMapper.delUnitsGroup("000101");
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

