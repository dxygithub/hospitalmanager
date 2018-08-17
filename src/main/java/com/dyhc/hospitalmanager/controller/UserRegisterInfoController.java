package com.dyhc.hospitalmanager.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSON;
import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import com.dyhc.hospitalmanager.service.UserRegisterInfoService;
import com.dyhc.hospitalmanager.util.PageTool;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UserRegisterInfoController {

    @Resource(name = "userRegisterInfoServiceImpl")
    private UserRegisterInfoService userRegisterInfoService;

    /**
     * 进入用户登记页面
     */
    @RequestMapping(value = "nursePre.html")
    public String getUserRegister() {
        return "nursePre";
    }

    /**
     * 查询个人的登记分页 创建人 创建时间为空
     * @param nameCode  姓名简码
     * @param username  姓名
     * @return
     */
    @RequestMapping(value = "nursePre.do")
    @ResponseBody
    public Map<String,Object> getpagefindUserRegisterUsername(String nameCode, String username,Integer index) {
        Integer indexNo=1;
        if (index!=null){
            indexNo=index;
        }
        PageTool<UserRegisterInfo> page=new PageTool<UserRegisterInfo>();
        page.setPageIndex(indexNo);
        page.setPageSize(2);
        page.setPageCount(userRegisterInfoService.findUserRegisterUsername(nameCode,username,0,0).size());
        List<UserRegisterInfo> userRegisterInfoList=new ArrayList<UserRegisterInfo>();
        userRegisterInfoList=userRegisterInfoService.findUserRegisterUsername(nameCode,username,(indexNo-1)*2,2);
        page.setDatalist(userRegisterInfoList);
        System.out.println(page);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",0);
        map.put("count",2);
        map.put("msg","错误提示");
        map.put("data",page);
        return map;
    }

    /**
     * 进入人员登记信息
     * @return
     */
    @RequestMapping(value = "nurseRegistration.html")
    public  String sendnurseRegistration(){
        return "nurseRegistration";
    }

    /**
     * 进行用户登记信息
     * @param userRegisterInfo
     * @return
     */
    @RequestMapping(value = "insertUserRegisterinfo.do")
    @ResponseBody
    public  String getregisterUserInfo(UserRegisterInfo userRegisterInfo){
        String data="";
        Integer result=userRegisterInfoService.addUserregisterinfo(userRegisterInfo);
        if (result>0){
             data="{\"status\":1}";
            System.out.println("新增成功");
        }else {
            data="{\"status\":0}";
            System.out.println("新增失败");
        }
        return data;
    }

    @RequestMapping("/getUserRegisterInfoByTestNumber.do")
    @ResponseBody
    public UserRegisterInfo getUserRegisterInfoByTestNumber(String testNumber){
        return userRegisterInfoService.findUserRegisterInfoByTestNumber(testNumber);
    }
    /**
     * 通过体检id查询用户信息
     * @param testNumber
     * @return
     */
    @RequestMapping(value = "/userRegisterInfo.do")
    @ResponseBody
    public UserRegisterInfo getUserTestInfoById(String testNumber){
        UserRegisterInfo userRegisterInfo=userRegisterInfoService.selUserTestInfoById(testNumber);
        System.out.println(userRegisterInfo.getUserName());
        return  userRegisterInfo;
    }

    /**
     * 批量新增用户信息
     * @return
     *//*
    @RequestMapping("/batchInsertInfo")
    @ResponseBody
    public String batchInsertInfo(@RequestParam("userArray") List<UserRegisterInfo> userArray){
        //实例化用户信息集合
        List<UserRegisterInfo> userRegisterInfos=new ArrayList<UserRegisterInfo>();
        UserRegisterInfo user=null;
        if(userArray!=null){
            //遍历用户信息数组
            for(int i=0;i<userArray.length;i++){
                //获取到用户信息数组
                String[] tempArray=(String[])userArray[i];
                //实例化用户
                user=new UserRegisterInfo();
                //设置新的用户体检编号
                user.setTestNumber(this.userRegisterInfoService.selLastUserInfoId());
                for(int a=0;a<tempArray.length;a++){
                    if(a==0){
                        //设置用户姓名
                        user.setUserName(tempArray[a]);
                    }else if(a==1){
                        //设置年龄
                        user.setAge(Integer.parseInt(tempArray[a]));
                    }else if(a==2){
                        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                        //获取日期
                        String datetime=tempArray[a];
                        if(datetime!=null&&!"".equals(datetime)){
                            //设置出生日期
                            try {
                                user.setBorn(sdf.parse(datetime));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }
                    }else if(a==3){
                        //设置性别
                        user.setSex(tempArray[a]);
                    }else if(a==4){
                        //设置身份证号码
                        user.setIdCard(tempArray[a]);
                    }else if(a==5){
                        //获取婚否状态
                        String marital_status=tempArray[a];
                        //设置婚否状态
                        if("已婚".equals(marital_status)){
                            user.setMaritalStatus(1);
                        }else {
                            user.setMaritalStatus(0);
                        }
                    }else if(a==6){
                        //设置电话号码
                        user.setTelephone(tempArray[a]);
                    }else if(a==7){
                        //获取联系地址
                        user.setAddress(tempArray[a]);
                    }else if(a==8){
                        //职务
                    }else if(a==9){
                        user.setBelongtoUnits(tempArray[a]);
                    }
                }
                user.setCreateBy(2);
                user.setCreateTime(new Date());
                userRegisterInfos.add(user);
            }
        }
        //批量新增用户
        Integer result=this.userRegisterInfoService.batchInsertUserInfo(userRegisterInfos);
        String json="";
        if(result>0){
            json="{\"stat\":\"ok\"}";
        }else {
            json="{\"stat\":\"no\"}";
        }
        return json;
    }*/

    /**
     * 批量新增用户信息
     * @return
     */
    @RequestMapping("/batchInsertInfo")
    @ResponseBody
    public String batchInsertInfo(@RequestParam("userRegisterInfos") List<UserRegisterInfo> userRegisterInfos){
        String json="";
        if(userRegisterInfos!=null){
            //批量新增用户
            Integer result=this.userRegisterInfoService.batchInsertUserInfo(userRegisterInfos);
            if(result>0){
                json="{\"stat\":\"ok\"}";
            }else {
                json="{\"stat\":\"no\"}";
            }
        }
        return json;
    }

}

