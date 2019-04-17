/*
 * Copyright 2018-2019 The Code Department.
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
package com.tcdng.jacklyn.organization.entities;

import com.tcdng.jacklyn.common.annotation.Managed;
import com.tcdng.jacklyn.common.entities.BaseVersionedStatusEntity;
import com.tcdng.jacklyn.organization.constants.OrganizationModuleNameConstants;
import com.tcdng.unify.core.annotation.Column;
import com.tcdng.unify.core.annotation.ForeignKey;
import com.tcdng.unify.core.annotation.ListOnly;
import com.tcdng.unify.core.annotation.Table;
import com.tcdng.unify.core.annotation.Tooling;
import com.tcdng.unify.core.annotation.UniqueConstraint;
import com.tcdng.unify.core.batch.BatchItemRecord;

/**
 * Represents branch entity.
 * 
 * @author Lateef Ojulari
 * @version 1.0
 */
@Tooling(name = "Branch", description = "Branch")
@Managed(module = OrganizationModuleNameConstants.ORGANIZATION_MODULE, title = "Branch", reportable = true,
        auditable = true)
@Table(name = "JKBRANCH", uniqueConstraints = { @UniqueConstraint({ "name" }), @UniqueConstraint({ "description" }) })
public class Branch extends BaseVersionedStatusEntity implements BatchItemRecord {

    @ForeignKey(Zone.class)
    private Long zoneId;

    @Column(name = "BRANCH_NM", length = 32)
    private String name;

    @Column(name = "BRANCH_DESC", length = 64)
    private String description;

    @Column(name="HEAD_OFFICE_FG")
    private Boolean headOffice;

    @ListOnly(key = "zoneId", property = "description")
    private String zoneDesc;

    @ListOnly(key = "zoneId", property = "languageTag")
    private String languageTag;

    @ListOnly(key = "zoneId", property = "timeZone")
    private String timeZone;
   
    @Override
    public Object getBatchId() {
        return null;
    }

    @Override
    public void setBatchId(Object id) {

    }

    @Override
    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(Boolean headOffice) {
        this.headOffice = headOffice;
    }

    public Long getZoneId() {
        return zoneId;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneDesc() {
        return zoneDesc;
    }

    public void setZoneDesc(String zoneDesc) {
        this.zoneDesc = zoneDesc;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getLanguageTag() {
        return languageTag;
    }

    public void setLanguageTag(String languageTag) {
        this.languageTag = languageTag;
    }
}
