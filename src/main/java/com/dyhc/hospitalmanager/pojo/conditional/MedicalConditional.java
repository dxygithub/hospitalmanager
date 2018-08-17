package com.dyhc.hospitalmanager.pojo.conditional;

import com.dyhc.hospitalmanager.pojo.Medical;

public class MedicalConditional extends Medical {

    //体检所属类型
    private String deskTypeName;
    //体检所属科室名称
    private String deskName;
    //所属的组合项
    private String combinationId;

    public String getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(String combinationId) {
        this.combinationId = combinationId;
    }

    public int getTest_status() {
        return test_status;
    }

    public void setTest_status(int test_status) {
        this.test_status = test_status;
    }

    //已检查
    private int test_status;

    public String getDeskTypeName() {
        return deskTypeName;
    }

    public void setDeskTypeName(String deskTypeName) {
        this.deskTypeName = deskTypeName;
    }

    public String getDeskName() {
        return deskName;
    }

    public void setDeskName(String deskName) {
        this.deskName = deskName;
    }
}
