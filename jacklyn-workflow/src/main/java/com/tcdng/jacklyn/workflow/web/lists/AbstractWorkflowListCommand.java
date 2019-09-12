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
package com.tcdng.jacklyn.workflow.web.lists;

import com.tcdng.jacklyn.common.web.lists.AbstractJacklynListCommand;
import com.tcdng.jacklyn.workflow.business.WorkflowService;
import com.tcdng.unify.core.annotation.Configurable;

/**
 * Convenient abstract workflow module list command implementation.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
public abstract class AbstractWorkflowListCommand<T> extends AbstractJacklynListCommand<T> {

    @Configurable
    private WorkflowService workflowService;

    public AbstractWorkflowListCommand(Class<T> paramType) {
        super(paramType);
    }

    protected WorkflowService getWorkflowModule() {
        return workflowService;
    }

}
