package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.DeskType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeskTypeMapper {

    /**
     * 新增科室类型
     * @param deskType 科室类型
     * @return
     * @throws Exception
     */
    int addDesk_type(DeskType   deskType)throws Exception;

    /**
     * 根据id查询科室类型
     * @param id
     * @return
     */
    DeskType   getDeskTypeById(@Param("deskTypeId")Integer id)throws Exception;

    /**
     * 修改科室类型
     * @param deskType
     * @return
     * @throws Exception
     */
    int updDeskType (DeskType    deskType)throws Exception;

    /**
     * 获取所有科室类型
     * @return
     * @throws Exception
     */
    List<DeskType> getAllDeskTypeList()throws Exception;

    /**
     * 删除科室类型
     * @param id
     * @return
     * @throws Exception
     */
    int delDeskTypeById(@Param("id")Integer id)throws Exception;
}
