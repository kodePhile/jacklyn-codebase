/*
 * Copyright 2018-2020 The Code Department.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.tcdng.jacklyn.workflow.entities;

import java.util.Date;

import com.tcdng.jacklyn.common.entities.BaseTimestampedEntity;
import com.tcdng.jacklyn.shared.workflow.WorkflowParticipantType;
import com.tcdng.unify.core.annotation.Column;
import com.tcdng.unify.core.annotation.ColumnType;
import com.tcdng.unify.core.annotation.ForeignKey;
import com.tcdng.unify.core.annotation.Index;
import com.tcdng.unify.core.annotation.ListOnly;
import com.tcdng.unify.core.annotation.Policy;
import com.tcdng.unify.core.annotation.Table;
import com.tcdng.unify.core.annotation.UniqueConstraint;

/**
 * Represents a workflow item.
 * 
 * @author Lateef Ojulari
 * @version 1.0
 */
@Policy("wfitem-entitypolicy")
@Table(
        name = "JKWFITEM", uniqueConstraints = { @UniqueConstraint({ "submissionId" }) },
        indexes = { @Index("wfItemSplitEventId"), @Index("branchCode"), @Index("departmentCode"),
                @Index("stepGlobalName") })
public class WfItem extends BaseTimestampedEntity {

    @ForeignKey(type = WfItemEvent.class, nullable = true)
    private Long wfHistEventId;

    @ForeignKey(type = WfItemSplitEvent.class, nullable = true)
    private Long wfItemSplitEventId;

    @Column(name = "SUBMISSION_ID", nullable = true)
    private Long submissionId;

    @Column(name = "BRANCH_CD", nullable = true)
    private String branchCode;

    @Column(name = "DEPARTMENT_CD", nullable = true)
    private String departmentCode;

    @Column(name = "GLOBAL_STEP_NM", length = 128)
    private String stepGlobalName;

    @Column(name = "SPLIT_BRANCH_NM", nullable = true)
    private String splitBranchName;

    @Column
    private Long wfItemAttachmentRefId;

    @Column(nullable = true)
    private WorkflowParticipantType participantType;

    @Column(type = ColumnType.TIMESTAMP_UTC, nullable = true)
    private Date stepDt;

    @Column(type = ColumnType.TIMESTAMP_UTC, nullable = true)
    private Date criticalDt;

    @Column(type = ColumnType.TIMESTAMP_UTC, nullable = true)
    private Date expectedDt;

    @Column(length = 96, nullable = true)
    private String heldBy;

    @Column(length = 96, nullable = true)
    private String forwardedBy;

    @Column(name = "CRITICAL_ALERT_SENT_FG", nullable = true)
    private Boolean criticalAlertSent;

    @Column(name = "EXPIRATION_ALERT_SENT_FG", nullable = true)
    private Boolean expirationAlertSent;
    
    @ListOnly(key = "wfHistEventId", property = "wfItemHistId")
    private Long wfItemHistId;

    @ListOnly(key = "wfHistEventId", property = "processGlobalName")
    private String processGlobalName;

    @ListOnly(key = "wfHistEventId", property = "docId")
    private Long docId;

    @ListOnly(key = "wfHistEventId", property = "wfItemDesc")
    private String wfItemDesc;

    @ListOnly(key = "wfHistEventId", property = "srcWfStepName")
    private String srcWfStepName;

    @ListOnly(key = "wfHistEventId", property = "prevWfStepName")
    private String prevWfStepName;
    
    @ListOnly(key = "wfHistEventId", property = "errorCode")
    private String errorCode;

    @ListOnly(key = "wfHistEventId", property = "errorMsg")
    private String errorMsg;

    public WfItem() {
        criticalAlertSent =  Boolean.FALSE;
        expirationAlertSent = Boolean.FALSE;
    }
    
    @Override
    public String getDescription() {
        return wfItemDesc;
    }

    public Long getWfItemHistId() {
        return wfItemHistId;
    }

    public void setWfItemHistId(Long wfItemHistId) {
        this.wfItemHistId = wfItemHistId;
    }

    public Long getWfHistEventId() {
        return wfHistEventId;
    }

    public void setWfHistEventId(Long wfHistEventId) {
        this.wfHistEventId = wfHistEventId;
    }

    public Long getWfItemSplitEventId() {
        return wfItemSplitEventId;
    }

    public void setWfItemSplitEventId(Long wfItemSplitEventId) {
        this.wfItemSplitEventId = wfItemSplitEventId;
    }

    public Long getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(Long submissionId) {
        this.submissionId = submissionId;
    }

    @Override
    public String getBranchCode() {
        return branchCode;
    }

    @Override
    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getStepGlobalName() {
        return stepGlobalName;
    }

    public void setStepGlobalName(String stepGlobalName) {
        this.stepGlobalName = stepGlobalName;
    }

    public String getSplitBranchName() {
        return splitBranchName;
    }

    public void setSplitBranchName(String splitBranchName) {
        this.splitBranchName = splitBranchName;
    }

    public Long getWfItemAttachmentRefId() {
        return wfItemAttachmentRefId;
    }

    public void setWfItemAttachmentRefId(Long wfItemAttachmentRefId) {
        this.wfItemAttachmentRefId = wfItemAttachmentRefId;
    }

    public WorkflowParticipantType getParticipantType() {
        return participantType;
    }

    public void setParticipantType(WorkflowParticipantType participantType) {
        this.participantType = participantType;
    }

    public Date getStepDt() {
        return stepDt;
    }

    public void setStepDt(Date stepDt) {
        this.stepDt = stepDt;
    }

    public Date getCriticalDt() {
        return criticalDt;
    }

    public void setCriticalDt(Date criticalDt) {
        this.criticalDt = criticalDt;
    }

    public Date getExpectedDt() {
        return expectedDt;
    }

    public void setExpectedDt(Date expectedDt) {
        this.expectedDt = expectedDt;
    }

    public String getHeldBy() {
        return heldBy;
    }

    public void setHeldBy(String heldBy) {
        this.heldBy = heldBy;
    }

    public String getForwardedBy() {
        return forwardedBy;
    }

    public void setForwardedBy(String forwardedBy) {
        this.forwardedBy = forwardedBy;
    }

    public Boolean getCriticalAlertSent() {
        return criticalAlertSent;
    }

    public void setCriticalAlertSent(Boolean criticalAlertSent) {
        this.criticalAlertSent = criticalAlertSent;
    }

    public Boolean getExpirationAlertSent() {
        return expirationAlertSent;
    }

    public void setExpirationAlertSent(Boolean expirationAlertSent) {
        this.expirationAlertSent = expirationAlertSent;
    }

    public String getProcessGlobalName() {
        return processGlobalName;
    }

    public void setProcessGlobalName(String processGlobalName) {
        this.processGlobalName = processGlobalName;
    }

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public String getWfItemDesc() {
        return wfItemDesc;
    }

    public void setWfItemDesc(String wfItemDesc) {
        this.wfItemDesc = wfItemDesc;
    }

    public String getSrcWfStepName() {
        return srcWfStepName;
    }

    public void setSrcWfStepName(String srcWfStepName) {
        this.srcWfStepName = srcWfStepName;
    }

    public String getPrevWfStepName() {
        return prevWfStepName;
    }

    public void setPrevWfStepName(String prevWfStepName) {
        this.prevWfStepName = prevWfStepName;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
