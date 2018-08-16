package com.dyhc.hospitalmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.pojo.Units;
import com.dyhc.hospitalmanager.service.UnitsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 单位信息维护控制
 * @author duxiaoyu
 */
@Controller
public class UnitsController {

    @Resource(name = "unitsServiceImpl")
    private UnitsService unitsService;

    /**
     * 获取所有单位信息
     * @return
     */
    @RequestMapping("/getAllUnits")
    @ResponseBody
    public String getAllUnits(){
        List<Units> units=this.unitsService.getAllUnitsList();
        String json=JSON.toJSONString(units);
        return json;
    }

    /**
     * 保存单位信息
     * @return
     */
    @RequestMapping("/addUnits")
    @ResponseBody
    public String addUnits(Units units){
        String json="";
        if(units!=null){
            units.setCreateBy(2);//系统管理员创建
            units.setCreateTime(new Date());//创建日期
            Integer result=this.unitsService.addUnits(units);
            if(result>0){
                json="{\"stat\":\"ok\"}";
            }else{
                json="{\"stat\":\"no\"}";
            }
        }
        return json;
    }

    /**
     * 修改单位信息
     * @return
     */
    @RequestMapping("/updateUnits")
    @ResponseBody
    public String updateUnits(Units units){
        String json="";
        if(units!=null){
            Integer result=this.unitsService.updUnits(units);
            if(result>0){
                json="{\"stat\":\"ok\"}";
            }else{
                json="{\"stat\":\"no\"}";
            }
        }
        return json;
    }

    /**
     * 根据单位编号获取单位信息
     * @param uid
     * @return
     */
    @RequestMapping("/getUnits")
    @ResponseBody
    public String getUnits(String uid){
        Units units=this.unitsService.getUnits(uid);
        String json=JSON.toJSONString(units);
        return json;
    }


    /**
     * 删除单位信息
     * @return
     */
    @RequestMapping("/delUnits")
    @ResponseBody
    public String delUnits(String uid){
        String json="";
        Integer result=this.unitsService.delUnits(uid);
        if(result>0){
            json="{\"stat\":\"ok\"}";
        }else{
            json="{\"stat\":\"no\"}";
        }
        return json;
    }

    /**
     * 获取新的单位编号
     * @return
     */
    @RequestMapping("/getNewUnitNumber")
    @ResponseBody
    public String getNewUnitNumber(){
        String newUnitId=this.unitsService.getUnitsNumber();
        return newUnitId;
    }

}
