package com.dyhc.hospitalmanager;

import com.dyhc.hospitalmanager.pojo.Desk;
import com.dyhc.hospitalmanager.service.DeskService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeskApplicationTest {

    @Autowired
    private DeskService deskService;

    Desk desk = null;

    @Before
    public void newDesk(){
        desk=new Desk();
        desk.setDeskId("23");
        desk.setDeskName("B超");
        desk.setDeskTypeId(2);
        desk.setDeskSummary("水水");
        desk.setDeskStatus(1);
        desk.setRemark("男娃");
    }

    @Test
    public void addDesk() {
        int result = 0;
        try {
            result = deskService.addDesk(desk);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    @Test
    public void updDesk() {
        System.out.println(desk.getDeskSummary());
        int result = 0;
        try {
            result = deskService.updDesk(desk);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    @Test
    public void selDeksById() {
        try {
            desk = deskService.selDeksById("01");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(desk.getDeskName());
    }

}
