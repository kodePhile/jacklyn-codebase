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

package com.tcdng.jacklyn.security.data;

import java.util.List;

import com.tcdng.jacklyn.common.entities.BaseLargeData;
import com.tcdng.jacklyn.security.entities.ClientApp;

/**
 * Client application large clientApp.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
public class ClientAppLargeData extends BaseLargeData<ClientApp> {

    private List<Long> systemAssetIdList;

    public ClientAppLargeData() {
        super(new ClientApp());
    }

    public ClientAppLargeData(ClientApp clientApp) {
        super(clientApp);
    }

    public ClientAppLargeData(ClientApp clientApp, List<Long> systemAssetIdList) {
        super(clientApp);
        this.systemAssetIdList = systemAssetIdList;
    }

    public List<Long> getSystemAssetIdList() {
        return systemAssetIdList;
    }

    public void setSystemAssetIdList(List<Long> systemAssetIdList) {
        this.systemAssetIdList = systemAssetIdList;
    }

}
