package com.dyhc.hospitalmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.pojo.GroupOrTestInfo;
import com.dyhc.hospitalmanager.pojo.UnitsGroup;
import com.dyhc.hospitalmanager.service.GroupOrTestInfoService;
import com.dyhc.hospitalmanager.service.UnitsGroupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class UnitsGroupController {

    @Resource(name = "unitsGroupServiceImpl")
    private UnitsGroupService unitsGroupService;

    @Resource(name = "groupOrTestInfoServiceImpl")
    private GroupOrTestInfoService groupOrTestInfoService;

    /**
     * 根据单位编号获取单位下的所有分组信息
     * @param unitId
     * @return
     */
    @RequestMapping("/getAllUnitGroupInfo")
    @ResponseBody
    public String getAllUnitGroupInfo(String unitId){
        List<UnitsGroup>  unitsGroups=this.unitsGroupService.getUnitsGroupList(unitId);
        String json=JSON.toJSONString(unitsGroups);
        return json;
    }

    /**
     * 保存单位分组信息
     * @param unitsGroup
     * @return
     */
    @RequestMapping("/addUnitGroup")
    @ResponseBody
    public String addUnitGroup(UnitsGroup unitsGroup,@RequestParam("package")Integer packageId){
        String json="";
        if(unitsGroup!=null){
            Integer result=this.unitsGroupService.addUnitsGroup(unitsGroup);
            GroupOrTestInfo groupOrTestInfo=new GroupOrTestInfo();
            groupOrTestInfo.setUnitsGroupId(unitsGroup.getUnitsGroupId());
            groupOrTestInfo.setPackageId(packageId);
            Integer groupOrTestInfoResult=this.groupOrTestInfoService.addGroupOrTestInfoMapper(groupOrTestInfo);
            if(result>0&&groupOrTestInfoResult>0){
                json="{\"stat\":\"ok\"}";
            }else {
                json="{\"stat\":\"no\"}";
            }
        }
        return json;
    }

    /**
     * 修改单位分组信息
     * @param unitsGroup
     * @return
     */
    @RequestMapping("/updateUnitGroup")
    @ResponseBody
    public String updateUnitGroup(UnitsGroup unitsGroup){
        String json="";
        Integer result=this.unitsGroupService.updUnitsGroup(unitsGroup);
        if(result>0){
            json="{\"stat\":\"ok\"}";
        }else {
            json="{\"stat\":\"no\"}";
        }
        return json;
    }

    /**
     * 根据单位分组编号删除分组信息
     * @param unitGroupId
     * @return
     */
    @RequestMapping("/delUnitGroup")
    @ResponseBody
    public String delUnitGroup(String unitGroupId){
        String json="";
        Integer result=this.unitsGroupService.delUnitsGroup(unitGroupId);
        if(result>0){
            json="{\"stat\":\"ok\"}";
        }else {
            json="{\"stat\":\"no\"}";
        }
        return json;
    }

    /**
     *根据比编号获取指定单位分组信息
     * @param unitGroupId
     * @return
     */
    @RequestMapping("/getUnitGroup")
    @ResponseBody
    public String getUnitGroup(String unitGroupId){
        UnitsGroup unitsGroup=this.unitsGroupService.getUnitsGroup(unitGroupId);
        String json=JSON.toJSONString(unitsGroup);
        return json;
    }

    /**
     * 返回新的指定单位下的分组编号
     * @return
     */
    @RequestMapping("/getNewUnitGroupId")
    @ResponseBody
    public String getNewUnitGroupId(String UnitId){
        String newUnitGroupId=this.unitsGroupService.getNewUbitsGroupId(UnitId);
        return newUnitGroupId;
    }
}
