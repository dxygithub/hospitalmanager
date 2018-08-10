package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.RoleType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleTypeMapper {

    List<RoleType> getRoleType();
}
