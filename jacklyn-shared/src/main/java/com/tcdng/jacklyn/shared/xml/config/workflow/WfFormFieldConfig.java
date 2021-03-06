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

/**
 * Form field configuration.
 * 
 * @author Lateef Ojulari
 * @version 1.0
 */
public class WfFormFieldConfig {

    private String binding;

    private String label;

    private String editorUpl;

    private Boolean required;

    public WfFormFieldConfig() {
        this.required = Boolean.TRUE;
    }

    public String getBinding() {
        return binding;
    }

    @XmlAttribute(required = true)
    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getLabel() {
        return label;
    }

    @XmlAttribute(name = "label")
    public void setLabel(String label) {
        this.label = label;
    }

    public String getEditorUpl() {
        return editorUpl;
    }

    @XmlAttribute(name = "editor")
    public void setEditorUpl(String editorUpl) {
        this.editorUpl = editorUpl;
    }

    public Boolean getRequired() {
        return required;
    }

    @XmlAttribute
    public void setRequired(Boolean required) {
        this.required = required;
    }

}
