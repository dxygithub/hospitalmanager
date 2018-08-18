package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.RoleInfoMapper;
import com.dyhc.hospitalmanager.pojo.RoleInfo;
import com.dyhc.hospitalmanager.service.RoleInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("roleInfoServiceImpl")
public class RoleInfoServiceImpl implements RoleInfoService {

    @Resource(name = "roleInfoMapper")
    private RoleInfoMapper roleInfoMapper;

    /**
     * 根据用户名和密码进行登录判断
     * @param userName
     * @param pwd
     * @return
     */
    @Override
    public RoleInfo login(String userName, String pwd) {
        RoleInfo roleInfo= null;
        try {
            roleInfo = roleInfoMapper.login(userName,pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (roleInfo!=null){
            return roleInfo;
        }else {
            return null;
        }
    }

    /**
     * 管理员登录
     * @param userName
     * @param pwd
     * @return
     */
    @Override
    public RoleInfo loginAdmin(String userName, String pwd) {
        RoleInfo roleInfo= null;
        try {
            roleInfo = roleInfoMapper.loginAdmin(userName,pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (roleInfo!=null){
            return roleInfo;
        }else {
            return null;
        }
    }
}
