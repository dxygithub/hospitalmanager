package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.UserRegisterInfoMapper;
import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import com.dyhc.hospitalmanager.service.UserRegisterInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.util.SimpleTypeUtil;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("userRegisterInfoServiceImpl")
public class UserRegisterInfoServiceImpl implements UserRegisterInfoService {

    @Resource(name = "userRegisterInfoMapper")
    private UserRegisterInfoMapper userRegisterInfoMapper;

    @Override
    public List<UserRegisterInfo> findUserRegisterUsername(String nameCode, String username,Integer pageIndex,Integer pageSize) {
        try {
            return userRegisterInfoMapper.findUserRegisterUsername(nameCode,username,pageIndex,pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int addUserregisterinfo(UserRegisterInfo userregisterinfo) {
        int result=0;
        try {
            String userRegisterId = userRegisterInfoMapper.selLastUserInfoId();
            userRegisterId=userRegisterId.substring(userRegisterId.length()-4,userRegisterId.length());
            Integer userRegisterIdInt=Integer.parseInt(userRegisterId);
            userRegisterIdInt=userRegisterIdInt+1;
            userRegisterId=userRegisterIdInt.toString();
            do {
                userRegisterId= "0"+userRegisterId;
            }while (userRegisterId.length()<4);
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String[] dateString=formatter.format(date).split("-");
            userregisterinfo.setTestNumber(dateString[0]+dateString[1]+dateString[2]+userRegisterId);
            result=userRegisterInfoMapper.addUserregisterinfo(userregisterinfo);
        } catch (Exception e) {
            e.printStackTrace();
            result=0;
        }
        return result;
    }

    @Override
    public List<UserRegisterInfo> findUserRegisterInfos(String nameCode,String telephone) {
        try {
            return userRegisterInfoMapper.findUserRegisterInfos(nameCode,telephone);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public UserRegisterInfo findUserRegisterInfoByTestNumber(String testNumber) {
        try {
            return userRegisterInfoMapper.findUserRegisterInfoByTestNumber(testNumber);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Integer registerUserInfo(UserRegisterInfo userRegisterInfo)  {
        System.out.println("aaaa"+userRegisterInfo.getUserName());
        Integer result=0;
        try {
            result=userRegisterInfoMapper.registerUserInfo(userRegisterInfo);
        } catch (Exception e) {
            e.printStackTrace();
            result=0;
        }
        return result;
    }
    @Override
    public UserRegisterInfo selUserTestInfoById(String testNumber) {
        try {
            return userRegisterInfoMapper.selUserTestInfoById(testNumber);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 批量新增用户信息
     * @param userRegisterInfos
     * @return
     */
    public Integer batchInsertUserInfo(List<UserRegisterInfo> userRegisterInfos) {
        Integer result=null;
        try {
            result=this.userRegisterInfoMapper.batchInsertUserInfo(userRegisterInfos);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 查询最后一个编号，生成新的用户ID
     * @return
     */
    public String selLastUserInfoId() {
        String result="";
        try {
            result=this.userRegisterInfoMapper.selLastUserInfoId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
