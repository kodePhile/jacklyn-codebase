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

package com.tcdng.jacklyn.workflow.web.widgets;

import com.tcdng.jacklyn.workflow.entities.WfFormPrivilege;
import com.tcdng.unify.core.annotation.Component;
import com.tcdng.unify.core.annotation.UplBinding;
import com.tcdng.unify.web.ui.panel.AbstractInMemoryTableCrudPanel;

/**
 * Workflow form privilege CRUD panel.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
@Component("ui-wfformprivilegecrudpanel")
@UplBinding("web/workflow/upl/wfformprivilegecrudpanel.upl")
public class WfFormPrivilegeCrudPanel extends AbstractInMemoryTableCrudPanel<WfFormPrivilege> {

    public WfFormPrivilegeCrudPanel() {
        super(WfFormPrivilege.class, "$m{workflow.wftemplate.wfstep.wfformprivilege}", false);
    }
}
