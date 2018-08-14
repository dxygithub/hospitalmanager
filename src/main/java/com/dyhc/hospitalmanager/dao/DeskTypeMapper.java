package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.DeskType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeskTypeMapper {

    int addDesk_type(DeskType   deskType)throws Exception;//新增科室类型
    DeskType   getById(@Param("id")Integer id);//根据id查询科室类型
    int updDeskType (DeskType    deskType)throws Exception;//修改科室类型
    List<DeskType> getAll()throws Exception; //查询科室类型
    int delDeskType  (@Param("id")Integer id)throws Exception; //删除科室类型
}
