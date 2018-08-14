package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.ProposedDescription;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProposedDescriptionMapper {
    /**
     * 根据常见结果id查询所有建议描述信息
     * @param commonResultsId
     * @return
     * @throws Exception
     */
    List<ProposedDescription>  getProposedDescriptioncommonResultsId(Integer commonResultsId)throws Exception;

    /**
     * 根据id查询所有建议描述信息
     * @param proposedDescriptionId
     * @return
     * @throws Exception
     */
    List<ProposedDescription> getProposedDescriptioncommonproposedDescriptionId(Integer proposedDescriptionId) throws Exception;

    /**
     *添加建议描述信息
     * @param proposedDescription
     * @return
     * @throws Exception
     */
    Integer insertProposedDescription(ProposedDescription proposedDescription) throws  Exception;

    /**
     * 根据id修改建议描述信息
     * @param proposedDescription
     * @return
     * @throws Exception
     */
    Integer updateProposedDescription(ProposedDescription proposedDescription) throws  Exception;
    /**
     *根据id修改建议描述信息状态
     */
    Integer updateProposedDescriptionisDelete(Integer proposedDescriptionId) throws Exception;
}
