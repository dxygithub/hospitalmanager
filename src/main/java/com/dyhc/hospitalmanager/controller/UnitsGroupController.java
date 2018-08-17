package com.dyhc.hospitalmanager.controller;

import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.pojo.GroupOrTestInfo;
import com.dyhc.hospitalmanager.pojo.UnitsGroup;
import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import com.dyhc.hospitalmanager.service.GroupOrTestInfoService;
import com.dyhc.hospitalmanager.service.UnitsGroupService;
import com.dyhc.hospitalmanager.util.ImportExcelUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
            //添加单位分组
            Integer result=this.unitsGroupService.addUnitsGroup(unitsGroup);
            //实例化单位分组和体检项关系实例
            GroupOrTestInfo groupOrTestInfo=new GroupOrTestInfo();
            //设置单位分组编号
            groupOrTestInfo.setUnitsGroupId(unitsGroup.getUnitsGroupId());
            //设置套餐编号
            groupOrTestInfo.setPackageId(packageId);
            //添加单位分组和体检项关系
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

    /**
     * 返回excel数据
     * @return
     */
    @RequestMapping("/returnExcelData")
    @ResponseBody
    public String returnExcelData(@RequestParam("excelFile") MultipartFile excelFile){
        ImportExcelUtil importExcelUtil=new ImportExcelUtil();
        //获取文件名称
        String fileName=excelFile.getName();
        List<UserRegisterInfo> userRegisterInfos=new ArrayList<UserRegisterInfo>();
        UserRegisterInfo userRegisterInfo=null;
        String json="";
        try {
            //获取文件流
            InputStream in=excelFile.getInputStream();
            List<List<Object>> infos=importExcelUtil.getBankListByExcel(in,fileName);
            for (List<Object> str:infos){
                userRegisterInfo=new UserRegisterInfo();
                for(int i=0;i<str.size();i++){
                    if(i==0){
                        //设置用户姓名
                        userRegisterInfo.setUserName(str.get(i).toString());
                    }else if(i==1){
                        //设置年龄
                        userRegisterInfo.setAge(Integer.parseInt(str.get(i).toString()));
                    }else if(i==2){
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                        //获取日期
                        String datetime=str.get(i).toString();
                        if(datetime!=null&&!"".equals(datetime)){
                            //设置出生日期
                            userRegisterInfo.setBorn(sdf.parse(datetime));
                        }
                    }else if(i==3){
                        //设置性别
                        userRegisterInfo.setSex(str.get(i).toString());
                    }else if(i==4){
                        //设置身份证号码
                        userRegisterInfo.setIdCard(str.get(i).toString());
                    }else if(i==5){
                        //获取婚否状态
                        String marital_status=str.get(i).toString();
                        //设置婚否状态
                        if("已婚".equals(marital_status)){
                            userRegisterInfo.setMaritalStatus(1);
                        }else {
                            userRegisterInfo.setMaritalStatus(0);
                        }
                    }else if(i==6){
                        //设置电话号码
                        userRegisterInfo.setTelephone(str.get(i).toString());
                    }else if(i==7){
                        //获取联系地址
                        userRegisterInfo.setAddress(str.get(i).toString());
                    }else if(i==8){
                        //职务
                    }else if(i==9){
                        userRegisterInfo.setBelongtoUnits(str.get(i).toString());
                    }
                }
                //加入用户集合
                userRegisterInfos.add(userRegisterInfo);
            }
            //转化为json
            json=JSON.toJSONString(userRegisterInfos);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
