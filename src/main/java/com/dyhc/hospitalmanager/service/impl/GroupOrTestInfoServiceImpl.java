package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.GroupOrTestInfoMapper;
import com.dyhc.hospitalmanager.pojo.GroupOrTestInfo;
import com.dyhc.hospitalmanager.service.GroupOrTestInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("groupOrTestInfoServiceImpl")
public class GroupOrTestInfoServiceImpl implements GroupOrTestInfoService {

    @Resource(name = "groupOrTestInfoMapper")
    private GroupOrTestInfoMapper groupOrTestInfoMapper;

    /**
     * 保存单位分组和套餐关系
     * @param groupOrTestInfo
     * @return
     */
    public Integer addGroupOrTestInfoMapper(GroupOrTestInfo groupOrTestInfo) {
        Integer result=null;
        try {
            result=this.groupOrTestInfoMapper.addGroupOrTestInfoMapper(groupOrTestInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
