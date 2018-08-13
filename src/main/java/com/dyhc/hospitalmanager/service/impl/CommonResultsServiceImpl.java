package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.CommonResultsMapper;
import com.dyhc.hospitalmanager.pojo.CommonResults;
import com.dyhc.hospitalmanager.service.CommonResultsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("commonResultsServiceImpl")
public class CommonResultsServiceImpl implements CommonResultsService {

    @Resource(name = "commonResultsMapper")
    private CommonResultsMapper commonResultsMapper;

    @Override
    public List<CommonResults> getCommonResultsByTestId(String TestId) {
        try {
            return commonResultsMapper.getCommonResultsByTestId(TestId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Integer insertCommonResult(CommonResults commonResults) {
        Integer result=0;
        try {
            result= commonResultsMapper.insertCommonResult(commonResults);
        } catch (Exception e) {
            e.printStackTrace();
            result=0;
        }
        return result;
    }

    @Override
    public List<CommonResults> getCommonResultsById(Integer commonResultsId) {
        try {
            return commonResultsMapper.getCommonResultsById(commonResultsId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Integer updateCommonResults(CommonResults commonResults) {
        Integer result=0;
        try {
            result=commonResultsMapper.updateCommonResults(commonResults);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return  result;
    }

    @Override
    public Integer updateCommonResultsisDelete(Integer commonResultsId) {
        try {
            return commonResultsMapper.updateCommonResultsisDelete(commonResultsId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
