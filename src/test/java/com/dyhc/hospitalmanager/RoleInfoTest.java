package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.RoleInfoMapper;
import com.dyhc.hospitalmanager.pojo.RoleInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleInfoTest {
    @Resource
    private RoleInfoMapper roleInfoMapper;
    @Test
    public  void  getRoleInfoList(){

    }
}
