package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.ArchivesMapper;
import com.dyhc.hospitalmanager.pojo.Archives;
import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArchivesTest {
    @Resource
    private ArchivesMapper archivesMapper;
    Archives archives=null;
    @Test
    public void addarchives(){
        archives=archivesMapper.addarchives("20180810001");
        System.out.println(archives.getCheckCount());
    }
    @Test
    public  void updateArchives(){
        int result=archivesMapper.updateArchives("20180810001");
    }
    UserRegisterInfo userRegisterInfo=null;
    @Test
    public void findUserRegisterInfoByTestNumber(){
        userRegisterInfo=archivesMapper.findUserRegisterInfoByTestNumber("20180810001");
        System.out.println(userRegisterInfo.getUserName());
    }
    @Test
    public  void addArchives(){
        int result=archivesMapper.addArchives("0000004","20180810004");
    }
}
