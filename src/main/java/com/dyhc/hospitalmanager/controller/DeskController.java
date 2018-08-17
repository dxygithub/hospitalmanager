package com.dyhc.hospitalmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.pojo.Desk;
import com.dyhc.hospitalmanager.service.DeskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DeskController {

    @Resource(name = "deskServiceImpl")
    private DeskService deskService;

    /**
     * wwm
     * @return
     * @throws Exception
     */
    @RequestMapping("/getAllDesk.do")
    @ResponseBody
    public Object getDesk() throws Exception{
        return JSON.toJSONString(deskService.getDeskList());
    }


    /**
     * wwm
     * @param deskId
     * @return
     * @throws Exception
     */
    @RequestMapping("/getDeskId.do")
    @ResponseBody
    public Object getIdDesk(@RequestParam("deskId")String deskId) throws Exception{
        return JSON.toJSONString(deskService.selDeksById(deskId));
    }


    /**
     * 新增或修改
     * @param desk
     * @return
     * @throws Exception
     */
    @RequestMapping("/addORupd.do")
    @ResponseBody
    public Object addORupd(Desk desk) throws Exception{
        System.out.println(desk.getDeskId());
        Desk desk1=deskService.selDeksById(desk.getDeskId());
        Integer num=0;
        if (desk1!=null){
            num=deskService.updDesk(desk);
        }else {
            num=deskService.addDesk(desk);
        }
        System.out.println(num);
        if (num>0){
            return "保存成功！";
        }else {
            return "保存失败！";
        }

    }
}
