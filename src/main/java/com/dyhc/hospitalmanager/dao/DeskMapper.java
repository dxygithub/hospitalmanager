package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.Desk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeskMapper extends CommsMapper<Desk>{

    /**
     * 查询所有科室
     * @return
     */
    List<Desk> getDeskList() throws Exception;
    /**
     * 新增科室
     * @param desk 科室对象
     * @return 执行行数
     */
    int addDesk(Desk desk) throws Exception;

    /**
     * 根据科室编号删除科室
     * @param deskId
     * @return
     */
    int delDesk(@Param("deskId") String deskId) throws Exception;

    /**
     * 修改科室信息
     * @param desk 科室对象
     * @return
     */
    int updDesk(Desk desk) throws Exception;

    /**
     * 根据科室编号查询该科室
     * @param deskId
     * @return
     */
    Desk selDeksById(@Param("deskId") String deskId) throws Exception;

    /**
     * 查询最后一个编号，生成新的科室ID
     * @return
     */
    String selLastDeskId() throws Exception;
}
