package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.Archives;
import com.dyhc.hospitalmanager.pojo.CombinationMedical;
import com.dyhc.hospitalmanager.pojo.PackageMedical;
import com.dyhc.hospitalmanager.pojo.UserRegisterInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArchivesMapper {

    /**
     * 判断用户是否存档
     * @param testnumber
     * @return
     */
    Archives addarchives(@Param("testnumber") String testnumber) throws Exception;

    /**
     * 如果用户存在档案，检查次数加1
     * @param testnumber
     * @return
     */
    Integer updateArchives(@Param("testnumber") String testnumber)throws Exception;

    /**
     * 用户存在档案将用户信息显示出来
     * @param testNumber
     * @return
     */
    UserRegisterInfo findUserRegisterInfoByTestNumber(@Param("testNumber") String testNumber)throws Exception;

    /**
     * 进行存档
     * @param archivesId,testNumber
     * @return
     */
    Integer addArchives(@Param("archivesId") String archivesId,@Param("testNumber") String testNumber)throws Exception;

    /**
     * 查询所有档案
     * @return
     */
    List<Archives>  getArchivesList()throws Exception;
}
