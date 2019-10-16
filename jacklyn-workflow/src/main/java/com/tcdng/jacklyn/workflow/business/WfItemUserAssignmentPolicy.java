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

package com.tcdng.jacklyn.workflow.business;

import com.tcdng.jacklyn.workflow.data.FlowingWfItem;
import com.tcdng.unify.core.UnifyComponent;
import com.tcdng.unify.core.UnifyException;

/**
 * Workflow item user assignment policy.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
public interface WfItemUserAssignmentPolicy extends UnifyComponent {

    /**
     * Executes workflow item user assignment policy using data from workflow item.
     * 
     * @param flowingWfItemReader
     *            the workflow item reader
     * @param branchOnly
     *            the branch only indicator
     * @param departmentOnly
     *            the department only indicator
     * @return the ID of user to assign workflow item to
     * @throws UnifyException
     *             if an error occurs
     */
    String execute(FlowingWfItem.Reader flowingWfItemReader, boolean branchOnly, boolean departmentOnly) throws UnifyException;
}