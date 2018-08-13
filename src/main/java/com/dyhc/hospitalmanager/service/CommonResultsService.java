package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.CommonResults;

import java.util.List;

public interface CommonResultsService {
    /**
     * 根据体检项id查询所有的常见结果
     * @param TestId
     * @return
     * @throws Exception
     */
    List<CommonResults> getCommonResultsByTestId(String TestId) ;
    /**
     * 新增常见结果
     */
    Integer insertCommonResult(CommonResults commonResults);
    /**
     * 根据id查询所有常见结果
     */
    List<CommonResults> getCommonResultsById(Integer commonResultsId);
    /**
     * 根据id修改常见结果
     */
    Integer updateCommonResults(CommonResults commonResults);
    /**
     *根据id修改常见结果状态
     */
    Integer updateCommonResultsisDelete(Integer commonResultsId);
}
