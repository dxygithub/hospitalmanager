package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.pojo.ProposedDescription;
import com.dyhc.hospitalmanager.service.ProposedDescriptionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProposedDescriptionTest {
    @Resource
    private ProposedDescriptionService proposedDescriptionService;
    @Test
    public  void  getProposedDescriptioncommonResultsId(){
        List<ProposedDescription> proposedDescriptionList=proposedDescriptionService.getProposedDescriptioncommonResultsId(1);
        for (ProposedDescription p:proposedDescriptionList) {
            System.out.println(p.getAdviceContent());
        }
    }
    @Test
    public  void insertProposedDescription(){
        ProposedDescription proposedDescription=new ProposedDescription();
        proposedDescription.setCommonResultsId(1);
        proposedDescription.setSciencePopularization("大家好");
        proposedDescription.setAdviceContent("我叫小白");
        proposedDescription.setIsDelete(1);
        Integer result=proposedDescriptionService.insertProposedDescription(proposedDescription);
        if (result>0){
            System.out.println("新增成功");
        }else {
            System.out.println("新增失败");
        }
    }
    @Test
    public  void updateProposedDescription(){
        ProposedDescription proposedDescription=new ProposedDescription();
        proposedDescription.setProposedDescriptionId(5);
        proposedDescription.setCommonResultsId(2);
        proposedDescription.setSciencePopularization("大家好");
        proposedDescription.setAdviceContent("我叫欣欣");
        proposedDescription.setIsDelete(1);
        Integer result=proposedDescriptionService.updateProposedDescription(proposedDescription);
        if (result>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
    @Test
    public  void  updateProposedDescriptionisDelete(){
        ProposedDescription proposedDescription=new ProposedDescription();
        proposedDescription.setIsDelete(0);
        int result=proposedDescriptionService.updateProposedDescriptionisDelete(5);
        if (result>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }
    }
}
