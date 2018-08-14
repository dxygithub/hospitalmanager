package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.MedicalMapper;
import com.dyhc.hospitalmanager.pojo.Medical;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicalTest {
    @Resource
    private MedicalMapper medicalMapper;
    @Test
    public  void SelMedicalByDeskId(){
        try {
            List<Medical> medicals=medicalMapper.SelMedicalByDeskId("03");
            for (Medical m:medicals) {
                System.out.println(m.getProjectName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  selMedicalById(){

        try {
            Medical  medical=medicalMapper.selMedicalById("010003");
            System.out.println(medical.getProjectName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public  void  addMedical(){
        Medical medical=new Medical();
        medical.setMedicalId("010006");
        medical.setDeskId("07");
        medical.setProjectName("无甲状腺");
        medical.setApplyGender("男");
        medical.setPingyingCode("wjzx");
        medical.setNormalResult("正常");
        medical.setResultType("文字描述");
        BigDecimal bigDecimal = new BigDecimal(100);
        medical.setPrice(bigDecimal);
        medical.setPromptInfo("五楼4号科室");
        medical.setUnit("mL");
        medical.setReferenceLowerLimit("50");
        medical.setReferenceUpperLimit("100");
        medical.setLowTip("40");
        medical.setHighTip("60");
        medical.setMinValue("50");
        medical.setMaxValue("70");
        medical.setIsEnalbe(0);
        try {
            int result=medicalMapper.addMedical(medical);
            if (result>0){
                System.out.println("新增成功");
            }else {
                System.out.println("新增失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  updMedical(){
        Medical medical=new Medical();
        medical.setMedicalId("010006");
        medical.setDeskId("07");
        medical.setProjectName("状腺");
        medical.setApplyGender("男");
        medical.setPingyingCode("zx");
        medical.setNormalResult("正常");
        medical.setResultType("文字描述");
        BigDecimal bigDecimal = new BigDecimal(100);
        medical.setPrice(bigDecimal);
        medical.setPromptInfo("五楼4号科室");
        medical.setUnit("mL");
        medical.setReferenceLowerLimit("50");
        medical.setReferenceUpperLimit("100");
        medical.setLowTip("40");
        medical.setHighTip("60");
        medical.setMinValue("50");
        medical.setMaxValue("70");
        medical.setIsEnalbe(0);
        try {
            int result=medicalMapper.updMedical(medical);
            if (result>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  getMedicalByCombinationId(){
        try {
            List<Medical> medicalList=medicalMapper.getMedicalByCombinationId("010001");
            for (Medical m: medicalList) {
                System.out.println(m.getProjectName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  getMedicalList(){
        try {
            List<Medical> medicalList=medicalMapper.getMedicalList("gz");
            for (Medical m:medicalList) {
                System.out.println(m.getProjectName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  deleteMedical(){
        Medical medical=new Medical();
        medical.setIsEnalbe(0);
        medical.setMedicalId("010001");
        int result= 0;
        try {
            result = medicalMapper.updMedical(medical);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }
    }
    @Test
    public  void  getMadical(){
        try {
            List<Medical> medicalList=medicalMapper.getMadical("20180810003");
            for (Medical m:medicalList) {
                System.out.println(m.getProjectName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  getPackage(){
        try {
            List<Medical> medicalList=medicalMapper.getPackage("20180810003");
            for (Medical m:medicalList) {
                System.out.println(m.getProjectName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public  void  getCom(){
        try {
            List<Medical> medicalList=medicalMapper.getCom("20180810002");
            for (Medical m:medicalList) {
                System.out.println(m.getProjectName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
