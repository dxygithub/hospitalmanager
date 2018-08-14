package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.Combination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CombinationMapper {

    /**
     * 根据科室id查询所有组合项
     * @param pageIndex
     * @param pageSize
     * @param deskId
     * @return
     */
    List<Combination> getCombinationInfoByDesk(@Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize, @Param("deskId") int deskId) throws  Exception;

    /**
     * 添加科室组合
     * @param combination
     * @return
     */
    int addCombinationInfo(Combination combination) throws  Exception;


    /**
     * 删除科室组合
     * @param combinationId
     * @return
     */
    int delCombinationInfo(@Param("combinationId") int combinationId) throws  Exception;

    /**
     * 根据id查询科室组合信息
     * @param combinationId
     * @return
     */
    List<Combination> getAllCombinationInfoByid(@Param("combinationId") int combinationId) throws  Exception;


    /**
     * 修改科室科室组合信息
     * @param combination
     * @return
     */
    int updCombinationInfo(Combination combination) throws  Exception;
}
