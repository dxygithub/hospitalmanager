package com.dyhc.hospitalmanager.service;

import com.dyhc.hospitalmanager.pojo.ProposedDescription;

import java.util.List;

public interface ProposedDescriptionService {
    /**
     * 根据常见结果id查询所有建议描述信息
     * @param commonResultsId
     * @return
     * @throws Exception
     */
    List<ProposedDescription> getProposedDescriptioncommonResultsId(Integer commonResultsId);

    /**
     * 根据id查询所有建议描述信息
     * @param proposedDescriptionId
     * @return
     * @throws Exception
     */
    List<ProposedDescription> getProposedDescriptioncommonproposedDescriptionId(Integer proposedDescriptionId);

    /**
     *添加建议描述信息
     * @param proposedDescription
     * @return
     * @throws Exception
     */
    Integer insertProposedDescription(ProposedDescription proposedDescription) ;

    /**
     * 根据id修改建议描述信息
     * @param proposedDescription
     * @return
     * @throws Exception
     */
    Integer updateProposedDescription(ProposedDescription proposedDescription);
    /**
     *根据id修改建议描述信息状态
     */
    Integer updateProposedDescriptionisDelete(Integer proposedDescriptionId);
}
