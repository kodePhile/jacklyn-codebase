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
package com.tcdng.jacklyn.shared.xml.config.module;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.tcdng.jacklyn.shared.xml.adapter.HAlignTypeXmlAdapter;
import com.tcdng.jacklyn.shared.xml.adapter.OrderTypeXmlAdapter;
import com.tcdng.unify.core.constant.HAlignType;
import com.tcdng.unify.core.constant.OrderType;

/**
 * Column configuration.
 * 
 * @author Lateef Ojulari
 * @version 1.0
 */
public class ColumnConfig {

    private String fieldName;

    private OrderType columnOrder;

    private HAlignType horizAlignType;
    
    private String description;

    private String type;

    private String formatter;

    private int width;

    private boolean group;

    private boolean groupOnNewPage;

    private boolean sum;

    public String getFieldName() {
        return fieldName;
    }

    @XmlAttribute(name = "field", required = true)
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute(name = "type")
    public void setType(String type) {
        this.type = type;
    }

    public OrderType getColumnOrder() {
        return columnOrder;
    }

    @XmlJavaTypeAdapter(OrderTypeXmlAdapter.class)
    @XmlAttribute(name = "order")
    public void setColumnOrder(OrderType columnOrder) {
        this.columnOrder = columnOrder;
    }

    public HAlignType getHorizAlignType() {
        return horizAlignType;
    }

    @XmlJavaTypeAdapter(HAlignTypeXmlAdapter.class)
    @XmlAttribute(name = "halign")
    public void setHorizAlignType(HAlignType horizAlignType) {
        this.horizAlignType = horizAlignType;
    }

    public String getFormatter() {
        return formatter;
    }

    @XmlAttribute
    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public String getDescription() {
        return description;
    }

    @XmlAttribute(required = true)
    public void setDescription(String description) {
        this.description = description;
    }

    public int getWidth() {
        return width;
    }

    @XmlAttribute
    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isGroup() {
        return group;
    }

    @XmlAttribute
    public void setGroup(boolean group) {
        this.group = group;
    }

    public boolean isGroupOnNewPage() {
        return groupOnNewPage;
    }

    @XmlAttribute
    public void setGroupOnNewPage(boolean groupOnNewPage) {
        this.groupOnNewPage = groupOnNewPage;
    }

    public boolean isSum() {
        return sum;
    }

    @XmlAttribute
    public void setSum(boolean sum) {
        this.sum = sum;
    }

}
