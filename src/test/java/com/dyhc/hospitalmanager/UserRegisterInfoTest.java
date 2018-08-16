package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.UserRegisterInfoMapper;
import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import org.apache.catalina.LifecycleState;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRegisterInfoTest {
    @Resource
    private UserRegisterInfoMapper userRegisterInfoMapper;

    @Test
    public void addUserregisterinfo(){
        UserRegisterInfo userRegisterInfo=new UserRegisterInfo();
        userRegisterInfo.setTestNumber("20180812012");
        userRegisterInfo.setUserName("王海");
        userRegisterInfo.setAge(12);
        Date dateInfo=new Date();
        userRegisterInfo.setBorn(dateInfo);
        userRegisterInfo.setSex("男");
        userRegisterInfo.setIdCard("140225199606010079");
        userRegisterInfo.setMaritalStatus(0);
        userRegisterInfo.setTelephone("17635697252");
        userRegisterInfo.setAddress("山西太原");
        userRegisterInfo.setNameCode("wh");
        userRegisterInfo.setWorkNumber("0002");
        userRegisterInfo.setPersonType(null);
        userRegisterInfo.setStatus(1);
        userRegisterInfo.setBelongtoUnits(2);
        userRegisterInfo.setCreateTime(null);
        userRegisterInfo.setCreateBy(1);
        int result= 0;
        try {
            result = userRegisterInfoMapper.addUserregisterinfo(userRegisterInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result>0){
            System.out.println("新增成功！");
        }else {
            System.out.println("新增失败！");
        }
    }
    UserRegisterInfo userRegisterInfo=null;
    @Test
    public  void  findUserRegisterInfoByTestNumber(){
        try {
            userRegisterInfo=userRegisterInfoMapper.findUserRegisterInfoByTestNumber("201808110011");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(userRegisterInfo.getUserName());

    }
}
