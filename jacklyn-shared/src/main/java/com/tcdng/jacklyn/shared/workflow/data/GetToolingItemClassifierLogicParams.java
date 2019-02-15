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

package com.tcdng.jacklyn.shared.workflow.data;

import javax.xml.bind.annotation.XmlRootElement;

import com.tcdng.jacklyn.shared.workflow.WorkflowRemoteCallNameConstants;
import com.tcdng.unify.web.RemoteCallParams;

/**
 * Get tooling item classifier logic request parameters.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
@XmlRootElement
public class GetToolingItemClassifierLogicParams extends RemoteCallParams {

    public GetToolingItemClassifierLogicParams() {
        super(WorkflowRemoteCallNameConstants.GET_TOOLING_ITEMCLASSIFIER_LOGIC_LIST);
    }

}
