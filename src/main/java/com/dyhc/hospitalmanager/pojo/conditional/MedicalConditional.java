package com.dyhc.hospitalmanager.pojo.conditional;

import com.dyhc.hospitalmanager.pojo.Medical;

public class MedicalConditional extends Medical {

    //体检所属类型
    private String deskTypeName;
    //体检所属科室名称
    private String deskName;

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
