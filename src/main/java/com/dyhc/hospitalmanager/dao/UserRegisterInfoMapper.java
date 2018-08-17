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
    int addUserregisterinfo(UserRegisterInfo userregisterinfo) throws Exception; //创建时间和创建人为空 --新增

    /**
     * 查询个人的预约记录 创建人 创建时间为空
     * @param nameCode  姓名简码
     * @param telephone  手机号
     * @return
     */
    List<UserRegisterInfo> findUserRegisterInfos(@Param("nameCode") String nameCode, @Param("telephone")String telephone) throws Exception;

    /**
     * 查询个人的预约记录 创建人 创建时间为空
     * @param nameCode 姓名简码
     * @param username 姓名
     * @return
     * @throws Exception
     */
    List<UserRegisterInfo> findUserRegisterUsername(@Param("nameCode") String nameCode, @Param("username")String username,@Param("pageIndex")Integer pageIndex,@Param("pageSize")Integer pageSize) throws Exception;

    /**
     *  根据用户编号查看登记信息
     * @param testNumber 用户编号
     * @return 用户登记信息
     */
    UserRegisterInfo findUserRegisterInfoByTestNumber(@Param("testNumber") String testNumber) throws Exception;

    /**
     *  进行用户登录信息
     * @param userRegisterInfo
     * @return
     */
    Integer registerUserInfo(UserRegisterInfo userRegisterInfo) throws Exception;


    /**
     * 批量新增用户信息
     * @param userRegisterInfos
     * @return
     */
    Integer batchInsertUserInfo(List<UserRegisterInfo> userRegisterInfos) throws Exception;

    /**
     * 查询最后一个编号，生成新的用户ID
     * @return
     */
    String selLastUserInfoId() throws Exception;
    /**
     * 通过体检项id查询用户信息
     */
    UserRegisterInfo selUserTestInfoById(@Param("testNumber")String testNumber) throws Exception;
}
