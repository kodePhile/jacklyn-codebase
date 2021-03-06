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
package com.tcdng.jacklyn.security.entities;

import java.util.Date;

import com.tcdng.jacklyn.common.constants.RecordStatus;
import com.tcdng.jacklyn.common.entities.BaseEntity;
import com.tcdng.jacklyn.organization.entities.Role;
import com.tcdng.unify.core.annotation.ForeignKey;
import com.tcdng.unify.core.annotation.ListOnly;
import com.tcdng.unify.core.annotation.Table;
import com.tcdng.unify.core.annotation.UniqueConstraint;
import com.tcdng.unify.core.data.Describable;
import com.tcdng.unify.core.util.StringUtils;

/**
 * Entity for storing user role information.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
@Table(name = "JKUSERROLE", uniqueConstraints = { @UniqueConstraint({ "userId", "roleId" }) })
public class UserRole extends BaseEntity implements Describable {

    @ForeignKey(User.class)
    private Long userId;

    @ForeignKey(Role.class)
    private Long roleId;

    @ListOnly(key = "userId", property = "loginId")
    private String userLoginId;

    @ListOnly(key = "userId", property = "fullName")
    private String userName;

    @ListOnly(key = "userId", property = "email")
    private String userEmail;

    @ListOnly(key = "userId", property = "mobileNo")
    private String userMobileNo;

    @ListOnly(key = "userId", property = "themeId")
    private Long userThemeId;

    @ListOnly(key = "userId", property = "status")
    private RecordStatus userStatus;

    @ListOnly(name = "BRANCH_CD", key = "userId", property = "branchCode")
    private String branchCode;

    @ListOnly(name = "SUPERVISOR_FG", key = "userId", property = "supervisor")
    private Boolean supervisor;

    @ListOnly(key = "roleId", property = "name")
    private String roleName;

    @ListOnly(key = "roleId", property = "description")
    private String roleDesc;

    @ListOnly(key = "roleId", property = "application")
    private String roleApplication;

    @ListOnly(key = "roleId", property = "activeBefore")
    private Date activeBefore;

    @ListOnly(key = "roleId", property = "activeAfter")
    private Date activeAfter;

    @ListOnly(key = "roleId", property = "status")
    private RecordStatus roleStatus;

    @ListOnly(key = "roleId", property = "themeId")
    private Long roleThemeId;

    @ListOnly(key = "roleId", property = "departmentId")
    private Long departmentId;

    @ListOnly(key = "roleId", property = "departmentName")
    private String departmentName;

    @ListOnly(key = "roleId", property = "departmentDesc")
    private String departmentDesc;

    @Override
    public String getDescription() {
        return StringUtils.concatenate(userName, " - ", roleDesc);
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobileNo() {
        return userMobileNo;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public Long getUserThemeId() {
        return userThemeId;
    }

    public void setUserThemeId(Long userThemeId) {
        this.userThemeId = userThemeId;
    }

    public RecordStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(RecordStatus userStatus) {
        this.userStatus = userStatus;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Boolean getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Boolean supervisor) {
        this.supervisor = supervisor;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleApplication() {
        return roleApplication;
    }

    public void setRoleApplication(String roleApplication) {
        this.roleApplication = roleApplication;
    }

    public Date getActiveBefore() {
        return activeBefore;
    }

    public void setActiveBefore(Date activeBefore) {
        this.activeBefore = activeBefore;
    }

    public Date getActiveAfter() {
        return activeAfter;
    }

    public void setActiveAfter(Date activeAfter) {
        this.activeAfter = activeAfter;
    }

    public RecordStatus getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(RecordStatus roleStatus) {
        this.roleStatus = roleStatus;
    }

    public Long getRoleThemeId() {
        return roleThemeId;
    }

    public void setRoleThemeId(Long roleThemeId) {
        this.roleThemeId = roleThemeId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }
}
