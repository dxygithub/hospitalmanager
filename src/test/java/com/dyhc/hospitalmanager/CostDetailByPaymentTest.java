package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.CostDetailMapper;
import com.dyhc.hospitalmanager.pojo.CostDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CostDetailByPaymentTest {
    @Resource
    private CostDetailMapper costDetailMapper;
    @Test
    public void addCostDetailByPayment(){
        CostDetail costDetail=new CostDetail();
        costDetail.setTestNumber("201808100002");
        costDetail.setMedicalId("010003");
        costDetail.setCostType(1);
        costDetail.setDate(null);
        costDetail.setNote(null);
        try {
            int result=costDetailMapper.addCostDetailByPayment(costDetail);
            if (result>0){
                System.out.println("新增成功！");
            }else {
                System.out.println("新增失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
