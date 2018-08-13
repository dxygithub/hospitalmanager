package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.pojo.CommonResults;
import com.dyhc.hospitalmanager.service.CommonResultsService;
import com.dyhc.hospitalmanager.service.impl.CommonResultsServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonResultsTest {
    @Resource
    private  CommonResultsService commonResultsService;

    @Test
    public  void  getCommonResultsByTestId(){
        List<CommonResults> commonResultsList=commonResultsService.getCommonResultsByTestId("010001");
        for (CommonResults commonResults: commonResultsList) {
            System.out.println(commonResults.getResultDesc());
        }
    }
    @Test
    public  void  insertCommonResult(){
        CommonResults commonResults=new CommonResults();
        commonResults.setResultCheckItem("010001");
        commonResults.setResultDesc("心肪肝");
        commonResults.setPinyinCode("xfg");
        commonResults.setIsPositive(1);
        commonResults.setIsConclusion(1);
        commonResults.setIsShowProject(1);
        commonResults.setIsDelete(1);
        int ressult=commonResultsService.insertCommonResult(commonResults);
        if (ressult>0){
            System.out.println("新增成功");
        }else {
            System.out.println("新增失败");
        }
    }

    @Test
    public  void  updateCommonResult(){
        CommonResults commonResults=new CommonResults();
        commonResults.setCommonResultsId(5);
        commonResults.setResultCheckItem("010001");
        commonResults.setResultDesc("脑肪肝");
        commonResults.setPinyinCode("nfg");
        commonResults.setIsPositive(2);
        commonResults.setIsConclusion(2);
        commonResults.setIsShowProject(2);
        commonResults.setIsDelete(2);
        int ressult=commonResultsService.updateCommonResults(commonResults);
        if (ressult>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
    @Test
    public  void  updateCommonResultsisDelete(){
        CommonResults commonResults=new CommonResults();
        commonResults.setIsDelete(0);
        int result=commonResultsService.updateCommonResultsisDelete(6);
        if (result>0){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }
    }
}
