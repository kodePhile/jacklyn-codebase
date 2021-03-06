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
package com.tcdng.jacklyn.common.entities;

import com.tcdng.jacklyn.common.constants.RecordStatus;

/**
 * Query class for base entity with status.
 *
 * @author Lateef Ojulari
 * @version 1.0
 */
public class BaseStatusEntityQuery<T extends BaseStatusEntity> extends BaseEntityQuery<T> {

    public BaseStatusEntityQuery(Class<T> entityClass) {
        super(entityClass);
    }

    public BaseStatusEntityQuery<T> status(RecordStatus status) {
        return (BaseStatusEntityQuery<T>) addEquals("status", status);
    }

    public BaseStatusEntityQuery<T> statusNot(RecordStatus status) {
        return (BaseStatusEntityQuery<T>) addNotEquals("status", status);
    }
}
