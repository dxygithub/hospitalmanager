package com.dyhc.hospitalmanager.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "desk")
public class Desk {
    private String deskId;
    private String deskName;
    private int deskTypeId;
    private String deskSummary;
    private int deskStatus;
    private String remark;


    public String getDeskId() {
        return deskId;
    }

    public void setDeskId(String deskId) {
        this.deskId = deskId;
    }

    public String getDeskName() {
        return deskName;
    }

    public void setDeskName(String deskName) {
        this.deskName = deskName;
    }

    public int getDeskTypeId() {
        return deskTypeId;
    }

    public void setDeskTypeId(int deskTypeId) {
        this.deskTypeId = deskTypeId;
    }

    public String getDeskSummary() {
        return deskSummary;
    }

    public void setDeskSummary(String deskSummary) {
        this.deskSummary = deskSummary;
    }

    public int getDeskStatus() {
        return deskStatus;
    }

    public void setDeskStatus(int deskStatus) {
        this.deskStatus = deskStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desk desk = (Desk) o;
        return deskTypeId == desk.deskTypeId &&
                deskStatus == desk.deskStatus &&
                Objects.equals(deskId, desk.deskId) &&
                Objects.equals(deskName, desk.deskName) &&
                Objects.equals(deskSummary, desk.deskSummary) &&
                Objects.equals(remark, desk.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(deskId, deskName, deskTypeId, deskSummary, deskStatus, remark);
    }
}
