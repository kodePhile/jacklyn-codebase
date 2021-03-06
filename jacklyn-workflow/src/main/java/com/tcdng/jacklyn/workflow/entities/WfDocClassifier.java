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

import java.util.List;

import com.tcdng.jacklyn.common.entities.BaseEntity;
import com.tcdng.unify.core.annotation.ChildList;
import com.tcdng.unify.core.annotation.Column;
import com.tcdng.unify.core.annotation.ForeignKey;
import com.tcdng.unify.core.annotation.ListOnly;
import com.tcdng.unify.core.annotation.Table;
import com.tcdng.unify.core.annotation.UniqueConstraint;
import com.tcdng.unify.core.constant.BinaryLogicType;

/**
 * Workflow document classifier definition entity.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
@Table(name = "JKWFDOCCLASSIFIER", uniqueConstraints = { @UniqueConstraint({ "wfDocId", "name" }),
        @UniqueConstraint({ "wfDocId", "description" }) })
public class WfDocClassifier extends BaseEntity {

    @ForeignKey(WfDoc.class)
    private Long wfDocId;

    @Column(name = "CLASSIFIER_NM", length = 32)
    private String name;

    @Column(name = "CLASSIFIER_DESC", length = 64)
    private String description;

    @Column(nullable = true, length=48)
    private String logic;

    @Column(nullable = true)
    private BinaryLogicType filterLogic;
    
    @ListOnly(key = "wfDocId", property = "name")
    private String wfDocName;

    @ListOnly(key = "wfDocId", property = "description")
    private String wfDocDesc;

    @ChildList
    private List<WfDocClassifierFilter> filterList;

    @Override
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getWfDocId() {
        return wfDocId;
    }

    public void setWfDocId(Long wfDocId) {
        this.wfDocId = wfDocId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public BinaryLogicType getFilterLogic() {
        return filterLogic;
    }

    public void setFilterLogic(BinaryLogicType filterLogic) {
        this.filterLogic = filterLogic;
    }

    public List<WfDocClassifierFilter> getFilterList() {
        return filterList;
    }

    public void setFilterList(List<WfDocClassifierFilter> filterList) {
        this.filterList = filterList;
    }

    public String getWfDocName() {
        return wfDocName;
    }

    public void setWfDocName(String wfDocName) {
        this.wfDocName = wfDocName;
    }

    public String getWfDocDesc() {
        return wfDocDesc;
    }

    public void setWfDocDesc(String wfDocDesc) {
        this.wfDocDesc = wfDocDesc;
    }
}
