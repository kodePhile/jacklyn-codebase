/*
 * Copyright 2018 The Code Department
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

package com.tcdng.jacklyn.security.business;

import com.tcdng.jacklyn.security.constants.SecurityModuleSysParamConstants;
import com.tcdng.jacklyn.system.business.SystemService;
import com.tcdng.unify.core.UnifyException;
import com.tcdng.unify.core.annotation.Component;
import com.tcdng.unify.core.annotation.Configurable;
import com.tcdng.unify.core.security.TwoWayStringCryptographImpl;

/**
 * Application key two-way string cryptograph.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
@Component(name = "applicationkey-cryptograph", description = "$m{applicationkey.cryptograph}")
public class ApplicationKeyCryptographImpl extends TwoWayStringCryptographImpl {

    @Configurable
    private SystemService systemService;

    @Override
    protected String getEncryptionKey() throws UnifyException {
        return systemService.getSysParameterValue(String.class,
                SecurityModuleSysParamConstants.APPLICATION_SECURITY_KEY);
    }
}
