package com.dyhc.hospitalmanager.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_test_info", schema = "hospital_test_manager_db", catalog = "")
public class UserTestInfo {
    private int userTestInfoId;
    private String testNumber;
    private String medicalId;
    private String combinationId;
    private String packageId;
    private int testStatus;

    @Id
    @Column(name = "user_test_info_id")
    public int getUserTestInfoId() {
        return userTestInfoId;
    }

    public void setUserTestInfoId(int userTestInfoId) {
        this.userTestInfoId = userTestInfoId;
    }

    @Basic
    @Column(name = "test_number")
    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    @Basic
    @Column(name = "medical_id")
    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    @Basic
    @Column(name = "combination_id")
    public String getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(String combinationId) {
        this.combinationId = combinationId;
    }

    @Basic
    @Column(name = "package_id")
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @Basic
    @Column(name = "test_status")
    public int getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(int testStatus) {
        this.testStatus = testStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserTestInfo that = (UserTestInfo) o;
        return userTestInfoId == that.userTestInfoId &&
                testStatus == that.testStatus &&
                Objects.equals(testNumber, that.testNumber) &&
                Objects.equals(medicalId, that.medicalId) &&
                Objects.equals(combinationId, that.combinationId) &&
                Objects.equals(packageId, that.packageId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userTestInfoId, testNumber, medicalId, combinationId, packageId, testStatus);
    }
}
