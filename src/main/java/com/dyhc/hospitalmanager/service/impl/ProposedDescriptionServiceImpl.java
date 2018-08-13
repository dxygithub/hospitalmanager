package com.dyhc.hospitalmanager.service.impl;

import com.dyhc.hospitalmanager.dao.ProposedDescriptionMapper;
import com.dyhc.hospitalmanager.pojo.ProposedDescription;
import com.dyhc.hospitalmanager.service.ProposedDescriptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("proposedDescriptionServiceImpl")
public class ProposedDescriptionServiceImpl implements ProposedDescriptionService {

    @Resource(name = "proposedDescriptionMapper")
    private ProposedDescriptionMapper proposedDescriptionMapper;

    @Override
    public List<ProposedDescription> getProposedDescriptioncommonResultsId(Integer commonResultsId) {
        try {
            return proposedDescriptionMapper.getProposedDescriptioncommonResultsId(commonResultsId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<ProposedDescription> getProposedDescriptioncommonproposedDescriptionId(Integer proposedDescriptionId) {
        try {
            return proposedDescriptionMapper.getProposedDescriptioncommonproposedDescriptionId(proposedDescriptionId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Integer insertProposedDescription(ProposedDescription proposedDescription) {
        Integer result=0;
        try {
            result=proposedDescriptionMapper.insertProposedDescription(proposedDescription);
        } catch (Exception e) {
            e.printStackTrace();
            result=0;
        }
            return result;
    }

    @Override
    public Integer updateProposedDescription(ProposedDescription proposedDescription) {
        Integer result=0;
        try {
            result=proposedDescriptionMapper.updateProposedDescription(proposedDescription);
        } catch (Exception e) {
            e.printStackTrace();
            result=0;
        }
        return  result;
    }

    @Override
    public Integer updateProposedDescriptionisDelete(Integer proposedDescriptionId) {
        try {
            return proposedDescriptionMapper.updateProposedDescriptionisDelete(proposedDescriptionId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
