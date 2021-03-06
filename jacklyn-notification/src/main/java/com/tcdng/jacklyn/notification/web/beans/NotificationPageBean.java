/*
 * Copyright 2018-2020 The Code Department
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

package com.tcdng.jacklyn.notification.web.beans;

import java.util.Date;

import com.tcdng.jacklyn.common.web.beans.BaseEntityPageBean;
import com.tcdng.jacklyn.notification.entities.Notification;
import com.tcdng.jacklyn.shared.notification.NotificationStatus;
import com.tcdng.jacklyn.shared.notification.NotificationType;

/**
 * Notification page bean.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
public class NotificationPageBean extends BaseEntityPageBean<Notification> {

    private Date searchCreateDt;

    private Long searchModuleId;

    private Long searchNotificationTemplateId;

    private NotificationType searchNotificationType;

    private NotificationStatus searchStatus;

    public NotificationPageBean() {
        super("$m{notification.notification.hint}");
    }

    public Date getSearchCreateDt() {
        return searchCreateDt;
    }

    public void setSearchCreateDt(Date searchCreateDt) {
        this.searchCreateDt = searchCreateDt;
    }

    public Long getSearchModuleId() {
        return searchModuleId;
    }

    public void setSearchModuleId(Long searchModuleId) {
        this.searchModuleId = searchModuleId;
    }

    public Long getSearchNotificationTemplateId() {
        return searchNotificationTemplateId;
    }

    public void setSearchNotificationTemplateId(Long searchNotificationTemplateId) {
        this.searchNotificationTemplateId = searchNotificationTemplateId;
    }

    public NotificationType getSearchNotificationType() {
        return searchNotificationType;
    }

    public void setSearchNotificationType(NotificationType searchNotificationType) {
        this.searchNotificationType = searchNotificationType;
    }

    public NotificationStatus getSearchStatus() {
        return searchStatus;
    }

    public void setSearchStatus(NotificationStatus searchStatus) {
        this.searchStatus = searchStatus;
    }


}
