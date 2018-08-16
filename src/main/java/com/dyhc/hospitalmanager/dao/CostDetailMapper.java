package com.dyhc.hospitalmanager.dao;

import com.dyhc.hospitalmanager.pojo.CostDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CostDetailMapper {

    /**
     * 缴费 状态为0
     * @param costDetail
     * @return
     */
    int addCostDetailByPayment(CostDetail costDetail ) throws  Exception;

    /**
     * 扣费 状态为1
     * @param costDetail
     * @return
     */
    int addCostDetailByDeductions(CostDetail costDetail) throws Exception;

    /**
     * 退费 状态为2
     * @param costDetail
     * @return
     */
    int addCostDetailByRefund(CostDetail costDetail) throws Exception;
}
