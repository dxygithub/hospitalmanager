package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.CommonResults;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommonResultsMapper {

    /**
     * 根据体检项id查询所有的常见结果
     * @param TestId
     * @return
     * @throws Exception
     */
    List<CommonResults> getCommonResultsByTestId(String TestId) throws Exception;
    /**
     * 新增常见结果
     */
    Integer insertCommonResult(CommonResults commonResults) throws  Exception;
    /**
     * 根据id查询所有常见结果
     */
    List<CommonResults> getCommonResultsById(Integer commonResultsId) throws Exception;
    /**
     * 根据id修改常见结果
     */
    Integer updateCommonResults(CommonResults commonResults) throws Exception;
    /**
     *根据id修改常见结果状态
     */
    Integer updateCommonResultsisDelete(Integer commonResultsId) throws Exception;
}
