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
package com.tcdng.jacklyn.shared.xml.config.workflow;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.tcdng.jacklyn.shared.workflow.WorkflowParticipantType;
import com.tcdng.jacklyn.shared.workflow.WorkflowStepPriority;
import com.tcdng.jacklyn.shared.workflow.WorkflowStepType;
import com.tcdng.jacklyn.shared.xml.adapter.WorkflowParticipantTypeXmlAdapter;
import com.tcdng.jacklyn.shared.xml.adapter.WorkflowStepPriorityXmlAdapter;
import com.tcdng.jacklyn.shared.xml.adapter.WorkflowStepTypeXmlAdapter;
import com.tcdng.jacklyn.shared.xml.config.BaseConfig;

/**
 * Workflow step configuration.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
public class WfStepConfig extends BaseConfig {

    private WorkflowStepType type;

    private WorkflowParticipantType participant;

    private WorkflowStepPriority priority;

    private String label;

    private String assigner;

    private String branch;

    private String origin;

    private Integer itemsPerSession;

    private Integer criticalMinutes;

    private Integer expiryMinutes;

    private Boolean audit;

    private Boolean branchOnly;

    private Boolean departmentOnly;

    private Boolean includeForwarder;

    private WfBranchesConfig wfBranchesConfig;

    private WfEnrichmentsConfig wfEnrichmentsConfig;

    private WfRoutingsConfig wfRoutingsConfig;

    private WfRecordActionsConfig wfRecordActionsConfig;

    private WfUserActionsConfig wfUserActionsConfig;

    private WfFormPrivilegesConfig wfFormPrivilegesConfig;

    private WfPoliciesConfig wfPoliciesConfig;

    private WfAlertsConfig wfAlertsConfig;

    public WfStepConfig() {
        this.type = WorkflowStepType.AUTOMATIC;
        this.participant = WorkflowParticipantType.NONE;
        this.priority = WorkflowStepPriority.NORMAL;
        this.audit = Boolean.FALSE;
        this.branchOnly = Boolean.FALSE;
        this.departmentOnly = Boolean.FALSE;
        this.includeForwarder = Boolean.FALSE;
        this.itemsPerSession = Integer.valueOf(0);
        this.criticalMinutes = Integer.valueOf(0);
        this.expiryMinutes = Integer.valueOf(0);
    }

    public WorkflowStepType getType() {
        return type;
    }

    @XmlJavaTypeAdapter(WorkflowStepTypeXmlAdapter.class)
    @XmlAttribute(required = true)
    public void setType(WorkflowStepType type) {
        if (type != null) {
            this.type = type;
        }
    }

    public WorkflowParticipantType getParticipant() {
        return participant;
    }

    @XmlJavaTypeAdapter(WorkflowParticipantTypeXmlAdapter.class)
    @XmlAttribute(required = true)
    public void setParticipant(WorkflowParticipantType participant) {
        if (participant != null) {
            this.participant = participant;
        }
    }

    public WorkflowStepPriority getPriority() {
        return priority;
    }

    @XmlJavaTypeAdapter(WorkflowStepPriorityXmlAdapter.class)
    @XmlAttribute(required = true)
    public void setPriority(WorkflowStepPriority priority) {
        if (priority != null) {
            this.priority = priority;
        }
    }

    public String getLabel() {
        return label;
    }

    @XmlAttribute
    public void setLabel(String label) {
        this.label = label;
    }

    public String getAssigner() {
        return assigner;
    }

    @XmlAttribute
    public void setAssigner(String assigner) {
        this.assigner = assigner;
    }

    public String getBranch() {
        return branch;
    }

    @XmlAttribute
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getOrigin() {
        return origin;
    }

    @XmlAttribute
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getItemsPerSession() {
        return itemsPerSession;
    }

    @XmlAttribute(name = "max-session-items", required = true)
    public void setItemsPerSession(Integer itemsPerSession) {
        this.itemsPerSession = itemsPerSession;
    }

    public Integer getCriticalMinutes() {
        return criticalMinutes;
    }

    @XmlAttribute(name = "critical-minutes", required = true)
    public void setCriticalMinutes(Integer criticalMinutes) {
        this.criticalMinutes = criticalMinutes;
    }

    public Integer getExpiryMinutes() {
        return expiryMinutes;
    }

    @XmlAttribute(name = "expiry-minutes", required = true)
    public void setExpiryMinutes(Integer expiryMinutes) {
        this.expiryMinutes = expiryMinutes;
    }

    public Boolean getAudit() {
        return audit;
    }

    @XmlAttribute
    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    public Boolean getBranchOnly() {
        return branchOnly;
    }

    @XmlAttribute(name = "branch-only")
    public void setBranchOnly(Boolean branchOnly) {
        this.branchOnly = branchOnly;
    }

    public Boolean getDepartmentOnly() {
        return departmentOnly;
    }

    @XmlAttribute(name = "department-only")
    public void setDepartmentOnly(Boolean departmentOnly) {
        this.departmentOnly = departmentOnly;
    }

    public Boolean getIncludeForwarder() {
        return includeForwarder;
    }

    @XmlAttribute(name = "include-forwarder")
    public void setIncludeForwarder(Boolean includeForwarder) {
        this.includeForwarder = includeForwarder;
    }

    public WfBranchesConfig getWfBranchesConfig() {
        return wfBranchesConfig;
    }

    @XmlElement(name = "branches")
    public void setWfBranchesConfig(WfBranchesConfig wfBranchesConfig) {
        this.wfBranchesConfig = wfBranchesConfig;
    }

    public WfEnrichmentsConfig getWfEnrichmentsConfig() {
        return wfEnrichmentsConfig;
    }

    @XmlElement(name = "enrichments")
    public void setWfEnrichmentsConfig(WfEnrichmentsConfig wfEnrichmentsConfig) {
        this.wfEnrichmentsConfig = wfEnrichmentsConfig;
    }

    public WfPoliciesConfig getWfPoliciesConfig() {
        return wfPoliciesConfig;
    }

    @XmlElement(name = "policies")
    public void setWfPoliciesConfig(WfPoliciesConfig wfPoliciesConfig) {
        this.wfPoliciesConfig = wfPoliciesConfig;
    }

    public WfAlertsConfig getWfAlertsConfig() {
        return wfAlertsConfig;
    }

    @XmlElement(name = "alerts")
    public void setWfAlertsConfig(WfAlertsConfig wfAlertsConfig) {
        this.wfAlertsConfig = wfAlertsConfig;
    }

    public WfRoutingsConfig getWfRoutingsConfig() {
        return wfRoutingsConfig;
    }

    @XmlElement(name = "routings")
    public void setWfRoutingsConfig(WfRoutingsConfig wfRoutingsConfig) {
        this.wfRoutingsConfig = wfRoutingsConfig;
    }

    public WfRecordActionsConfig getWfRecordActionsConfig() {
        return wfRecordActionsConfig;
    }

    @XmlElement(name = "record-actions")
    public void setWfRecordActionsConfig(WfRecordActionsConfig wfRecordActionsConfig) {
        this.wfRecordActionsConfig = wfRecordActionsConfig;
    }

    public WfUserActionsConfig getWfUserActionsConfig() {
        return wfUserActionsConfig;
    }

    @XmlElement(name = "user-actions")
    public void setWfUserActionsConfig(WfUserActionsConfig wfUserActionsConfig) {
        this.wfUserActionsConfig = wfUserActionsConfig;
    }

    public WfFormPrivilegesConfig getWfFormPrivilegesConfig() {
        return wfFormPrivilegesConfig;
    }

    @XmlElement(name = "form-privileges")
    public void setWfFormPrivilegesConfig(WfFormPrivilegesConfig wfFormPrivilegesConfig) {
        this.wfFormPrivilegesConfig = wfFormPrivilegesConfig;
    }

}
