package com.dyhc.hospitalmanager.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "package_medical", schema = "hospital_test_manager_db", catalog = "")
public class PackageMedical {
    private int packageMedicalId;
    private int packageId;
    private String combinationId;
    private String medicalId;

    @Id
    @Column(name = "package_medical_id")
    public int getPackageMedicalId() {
        return packageMedicalId;
    }

    public void setPackageMedicalId(int packageMedicalId) {
        this.packageMedicalId = packageMedicalId;
    }

    @Basic
    @Column(name = "package_id")
    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
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
    @Column(name = "medical_id")
    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageMedical that = (PackageMedical) o;
        return packageMedicalId == that.packageMedicalId &&
                packageId == that.packageId &&
                Objects.equals(combinationId, that.combinationId) &&
                Objects.equals(medicalId, that.medicalId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(packageMedicalId, packageId, combinationId, medicalId);
    }
}
