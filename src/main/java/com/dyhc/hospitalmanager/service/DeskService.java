package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.Desk;

public interface DeskService {

    /**
     * 新增科室
     * @param desk 科室对象
     * @return 执行行数
     */
    int addDesk(Desk desk) throws Exception;


    /**
     * 修改科室
     * @param desk 科室对象
     * @return 执行行数
     */
    int updDesk(Desk desk) throws Exception;


    /**
     * 根据科室编号删除科室
     * @param deskId
     * @return
     */
    int delDesk(String deskId) throws Exception;


    /**
     * 根据科室编号查询该科室
     * @param deskId
     * @return
     */
    Desk selDeksById(String deskId) throws Exception;
}
