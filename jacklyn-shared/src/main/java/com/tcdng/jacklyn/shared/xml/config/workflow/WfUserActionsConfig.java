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

package com.tcdng.jacklyn.shared.xml.config.workflow;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * Workflow user actions configuration.
 * 
 * @author Lateef Ojulari
 * @version 1.0
 */
public class WfUserActionsConfig {

    private List<WfUserActionConfig> wfUserActionConfigList;

    public List<WfUserActionConfig> getWfUserActionConfigList() {
        return wfUserActionConfigList;
    }

    @XmlElement(name = "user-action", required = true)
    public void setWfUserActionConfigList(List<WfUserActionConfig> wfUserActionConfigList) {
        this.wfUserActionConfigList = wfUserActionConfigList;
    }

}
