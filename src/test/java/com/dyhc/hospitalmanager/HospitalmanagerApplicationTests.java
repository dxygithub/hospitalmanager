package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.dao.RoleTypeMapper;
import com.dyhc.hospitalmanager.pojo.RoleType;
import com.dyhc.hospitalmanager.service.DeskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalmanagerApplicationTests {

    @Resource(name = "roleTypeMapper")
    private RoleTypeMapper roleTypeMapper;

    @Test
    public void contextLoads() {

    }

}
