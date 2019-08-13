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
package com.tcdng.jacklyn.shared.file;

import com.tcdng.unify.core.annotation.StaticList;
import com.tcdng.unify.core.constant.EnumConst;
import com.tcdng.unify.core.util.EnumUtils;

/**
 * File outbox transfer status constants.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
@StaticList("fileoutboxstatuslist")
public enum FileOutboxStatus implements EnumConst {

    NOT_SENT("N"), SENT("S"), ABORTED("A");

    private final String code;

    private FileOutboxStatus(String code) {
        this.code = code;
    }

    @Override
    public String code() {
        return this.code;
    }

    @Override
    public String defaultCode() {
        return NOT_SENT.code;
    }

    public static FileOutboxStatus fromCode(String code) {
        return EnumUtils.fromCode(FileOutboxStatus.class, code);
    }

    public static FileOutboxStatus fromName(String name) {
        return EnumUtils.fromName(FileOutboxStatus.class, name);
    }
}
