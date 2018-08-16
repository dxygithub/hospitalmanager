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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

}

