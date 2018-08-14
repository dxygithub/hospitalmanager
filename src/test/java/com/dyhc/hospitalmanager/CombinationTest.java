package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.CombinationMapper;
import com.dyhc.hospitalmanager.pojo.Combination;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CombinationTest {
    @Resource
    private CombinationMapper combinationMapper;
    @Test
    public void Selcombinationid(){
        try {
            List<Combination> combinationList=combinationMapper.getAllCombinationInfoByid("0101");
            for (Combination c:combinationList) {
                System.out.println(c.getCombinationName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void getCombinationInfoByDesk(){
        try {
            List<Combination> combinationList=combinationMapper.getCombinationInfoByDesk(0,5,"01");
            for (Combination c:combinationList) {
                System.out.println(c.getCombinationName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void addCombinationInfo(){
        Combination combination=new Combination();
        combination.setCombinationId("0303");
        combination.setDeskId("01");
        combination.setCombinationName("肝");
        combination.setPinyinCode("g");
        combination.setClinicalSignificance("很不错");
        combination.setPromptInformation("五楼四号");
        combination.setNormalDesc("主要检查肝");
        combination.setCheckType("肝类");
        combination.setResultToWay("手工输入");
        combination.setIsSpecimen(1);
        combination.setSpecimenType(null);
        combination.setIsEnable(1);
        try {
            int result=combinationMapper.addCombinationInfo(combination);
            if (result>0){
                System.out.println("新增成功！");
            }else {
                System.out.println("新增失败!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  updCombinationInfo(){
        Combination combination=new Combination();
        combination.setCombinationId("0303");
        combination.setDeskId("01");
        combination.setCombinationName("肺");
        combination.setPinyinCode("f");
        combination.setClinicalSignificance("很不错");
        combination.setPromptInformation("五楼四号");
        combination.setNormalDesc("主要检查肺");
        combination.setCheckType("肺类");
        combination.setResultToWay("手工输入");
        combination.setIsSpecimen(1);
        combination.setSpecimenType(null);
        combination.setIsEnable(1);
        try {
            int result=combinationMapper.updCombinationInfo(combination);
            if (result>0){
                System.out.println("修改成功！");
            }else {
                System.out.println("修改失败!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void delCombinationInfo(){
        try {
            int result=combinationMapper.delCombinationInfo("0102");
            if (result>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
