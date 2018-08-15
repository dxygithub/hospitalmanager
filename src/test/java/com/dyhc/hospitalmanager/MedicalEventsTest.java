package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.MedicalEventsMapper;
import com.dyhc.hospitalmanager.pojo.MedicalEvents;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.security.PublicKey;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicalEventsTest {
    @Resource
    private MedicalEventsMapper medicalEventsMapper;
    @Test
    public  void  updMedicalEvents(){
        MedicalEvents medicalEvents=new MedicalEvents();
        medicalEvents.setMedicalEventsId(2);
        medicalEvents.setEventsName("心");
        medicalEvents.setUnit("L");
        medicalEvents.setReferenceLowerLimit("10");
        medicalEvents.setReferenceUpperLimit("30");
        medicalEvents.setLowTip("20");
        medicalEvents.setHighTip("70");
        medicalEvents.setMinValue("60");
        medicalEvents.setMaxValue("100");
        medicalEvents.setMedicalId("010002");
        int result= 0;
        try {
            result = medicalEventsMapper.updMedicalEvents(medicalEvents);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败");
        }
    }
    MedicalEvents medicalEvents=null;
    @Test
    public  void selMedicalEventsByTestId(){
        try {
            medicalEvents=medicalEventsMapper.selMedicalEventsByTestId("010000");
        } catch (Exception e) {

        }
        System.out.println(medicalEvents.getEventsName());
    }
}
