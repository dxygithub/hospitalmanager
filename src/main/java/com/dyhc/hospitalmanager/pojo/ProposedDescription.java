package com.dyhc.hospitalmanager.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "proposed_description", schema = "hospital_test_manager_db", catalog = "")
public class ProposedDescription {
    private int proposedDescriptionId;
    private int commonResultsId;
    private String sciencePopularization;
    private String adviceContent;
    private int isDelete;

    @Id
    @Column(name = "proposed_description_id")
    public int getProposedDescriptionId() {
        return proposedDescriptionId;
    }

    public void setProposedDescriptionId(int proposedDescriptionId) {
        this.proposedDescriptionId = proposedDescriptionId;
    }

    @Basic
    @Column(name = "common_results_id")
    public int getCommonResultsId() {
        return commonResultsId;
    }

    public void setCommonResultsId(int commonResultsId) {
        this.commonResultsId = commonResultsId;
    }

    @Basic
    @Column(name = "science_popularization")
    public String getSciencePopularization() {
        return sciencePopularization;
    }

    public void setSciencePopularization(String sciencePopularization) {
        this.sciencePopularization = sciencePopularization;
    }

    @Basic
    @Column(name = "advice_content")
    public String getAdviceContent() {
        return adviceContent;
    }

    public void setAdviceContent(String adviceContent) {
        this.adviceContent = adviceContent;
    }

    @Basic
    @Column(name = "isDelete")
    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProposedDescription that = (ProposedDescription) o;
        return proposedDescriptionId == that.proposedDescriptionId &&
                commonResultsId == that.commonResultsId &&
                isDelete == that.isDelete &&
                Objects.equals(sciencePopularization, that.sciencePopularization) &&
                Objects.equals(adviceContent, that.adviceContent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(proposedDescriptionId, commonResultsId, sciencePopularization, adviceContent, isDelete);
    }
}
