package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.Medical;
import com.dyhc.hospitalmanager.pojo.PackageMedical;
import com.dyhc.hospitalmanager.pojo.UserTestInfo;
import com.dyhc.hospitalmanager.pojo.conditional.MedicalConditional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MedicalMapper {

    /**
     * 根据科室id，查询该科室下的所有体检项
     * @param deskId
     * @return
     */
    List<Medical> SelMedicalByDeskId(@Param("deskId") String deskId) throws Exception;

    /**
     * 根据体检项编号查询该项目
     * @param medicalId 项目项编号
     * @return
     */
    Medical selMedicalById(@Param("medicalId") String medicalId) throws Exception;

    /**
     * 新增体检项
     * @param medical 体检项对象
     * @return
     */
    int addMedical(Medical medical) throws Exception;

    /**
     * 修改体检项
     * @param medical 体检项对象
     * @return
     */
    int updMedical(Medical medical) throws Exception;

    /**
     * 根据组合项id查询体检项
     * @param CombinationId 组合项id
     * @return
     * @throws Exception
     */
    List<Medical>  getMedicalByCombinationId(@Param("CombinationId") String  CombinationId)throws Exception;

    /**
     * 根据拼音简码查询体检信息
     * @param namecode
     * @return
     */
    List<Medical>  getMedicalList(@Param("namecode") String namecode)throws Exception;

    /**
     * 获取用户的体检项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getMadical(@Param("test_number") String test_number)throws Exception;

    /**
     * 获取用户的套餐项下的体检项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getPackageMedical(@Param("test_number")String test_number)throws Exception;

    /**
     * 获取用户套餐项下的组合项的体检项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getPackageCom(@Param("test_number")String test_number) throws Exception;

    /**
     * 获取用户组合项
     * @param test_number 用户编号
     * @return
     * @throws Exception
     */
    List<MedicalConditional> getCom(@Param("test_number")String test_number)throws Exception;

    /**
     * 通过体检编号获取体检项目
     */
    List<UserTestInfo> selMedicaltestNumber(@Param("testNumber")String testNumber) throws Exception;

    /**
     * 根据用户编号查询该科室下的所有体检项
     * @param testNumber 用户编号
     * @param deskId 单位Id
     * @return
     */
    List<MedicalConditional> getUserDeskMedicalByTestNumber(@Param("testNumber") String testNumber,@Param("deskId") String deskId) throws Exception;
}