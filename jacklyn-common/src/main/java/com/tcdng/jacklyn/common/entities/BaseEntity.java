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
package com.tcdng.jacklyn.common.entities;

import com.tcdng.unify.core.annotation.Policy;
import com.tcdng.unify.core.annotation.Tooling;
import com.tcdng.unify.core.data.Document;
import com.tcdng.unify.core.system.entities.AbstractSequencedEntity;

/**
 * Base class for all entities.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
@Tooling(name = "baseEntity", description = "Base Common")
@Policy("baseentity-policy")
public abstract class BaseEntity extends AbstractSequencedEntity implements Document {

    @Override
    public String getBranchCode() {
        return null;
    }

    @Override
    public String getDepartmentCode() {
        return null;
    }

}
