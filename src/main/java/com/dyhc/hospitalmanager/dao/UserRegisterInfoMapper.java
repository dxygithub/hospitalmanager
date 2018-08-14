package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRegisterInfoMapper {

    /**
     * 预约
     * @param userregisterinfo
     * @return
     */
    int addUserregisterinfo(UserRegisterInfo userregisterinfo); //创建时间和创建人为空 --新增

    /**
     * 查询个人的预约记录 创建人 创建时间为空
     * @param nameCode  姓名简码
     * @param telephone  手机号
     * @return
     */
    List<UserRegisterInfo> findUserRegisterInfos(@Param("nameCode") String nameCode, @Param("telephone")String telephone);

    /**
     *  根据用户编号查看存档信息 存在这个用户 就把用户信息显示出来,并且检查次数加1==>updArchivesCheckCount()方法
     * @param testNumber 用户编号
     * @return 用户登记信息
     */
    UserRegisterInfo findUserRegisterInfoByTestNumber(@Param("testNumber") String testNumber);

    /**
     *  进行用户登录信息
     * @param userRegisterInfo
     * @return
     */
    Integer registerUserInfo(UserRegisterInfo userRegisterInfo);
}
