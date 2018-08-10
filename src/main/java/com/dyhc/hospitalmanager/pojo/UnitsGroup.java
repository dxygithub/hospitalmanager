package com.dyhc.hospitalmanager.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "units_group", schema = "hospital_test_manager_db", catalog = "")
public class UnitsGroup {
    private String unitsGroupId;
    private String groupName;
    private String unitsId;
    private String sexCondition;
    private String maritalCondition;
    private Integer ageUpperLimit;
    private Integer ageLowerLimit;
    private String dutyCondition;
    private int createBy;
    @JSONField(format="yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;
    private int modifyBy;
    @JSONField(format="yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date modifuTime;
    private int isdelete;

    @Id
    @Column(name = "units_group_id")
    public String getUnitsGroupId() {
        return unitsGroupId;
    }

    public void setUnitsGroupId(String unitsGroupId) {
        this.unitsGroupId = unitsGroupId;
    }

    @Basic
    @Column(name = "group_name")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "units_id")
    public String getUnitsId() {
        return unitsId;
    }

    public void setUnitsId(String unitsId) {
        this.unitsId = unitsId;
    }

    @Basic
    @Column(name = "sex_condition")
    public String getSexCondition() {
        return sexCondition;
    }

    public void setSexCondition(String sexCondition) {
        this.sexCondition = sexCondition;
    }

    @Basic
    @Column(name = "marital_condition")
    public String getMaritalCondition() {
        return maritalCondition;
    }

    public void setMaritalCondition(String maritalCondition) {
        this.maritalCondition = maritalCondition;
    }

    @Basic
    @Column(name = "age_upper_limit")
    public Integer getAgeUpperLimit() {
        return ageUpperLimit;
    }

    public void setAgeUpperLimit(Integer ageUpperLimit) {
        this.ageUpperLimit = ageUpperLimit;
    }

    @Basic
    @Column(name = "age_lower_limit")
    public Integer getAgeLowerLimit() {
        return ageLowerLimit;
    }

    public void setAgeLowerLimit(Integer ageLowerLimit) {
        this.ageLowerLimit = ageLowerLimit;
    }

    @Basic
    @Column(name = "duty_condition")
    public String getDutyCondition() {
        return dutyCondition;
    }

    public void setDutyCondition(String dutyCondition) {
        this.dutyCondition = dutyCondition;
    }

    @Basic
    @Column(name = "create_by")
    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "modify_by")
    public int getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Basic
    @Column(name = "modifu_time")
    public Date getModifuTime() {
        return modifuTime;
    }

    public void setModifuTime(Date modifuTime) {
        this.modifuTime = modifuTime;
    }

    @Basic
    @Column(name = "isdelete")
    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitsGroup that = (UnitsGroup) o;
        return createBy == that.createBy &&
                modifyBy == that.modifyBy &&
                isdelete == that.isdelete &&
                Objects.equals(unitsGroupId, that.unitsGroupId) &&
                Objects.equals(groupName, that.groupName) &&
                Objects.equals(unitsId, that.unitsId) &&
                Objects.equals(sexCondition, that.sexCondition) &&
                Objects.equals(maritalCondition, that.maritalCondition) &&
                Objects.equals(ageUpperLimit, that.ageUpperLimit) &&
                Objects.equals(ageLowerLimit, that.ageLowerLimit) &&
                Objects.equals(dutyCondition, that.dutyCondition) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifuTime, that.modifuTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(unitsGroupId, groupName, unitsId, sexCondition, maritalCondition, ageUpperLimit, ageLowerLimit, dutyCondition, createBy, createTime, modifyBy, modifuTime, isdelete);
    }
}
