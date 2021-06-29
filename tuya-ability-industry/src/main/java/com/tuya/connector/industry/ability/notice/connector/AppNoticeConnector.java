package com.tuya.connector.industry.ability.notice.connector;

import com.tuya.connector.industry.ability.notice.model.AppNotice;
import com.tuya.connector.industry.ability.notice.model.AppNoticeTemplate;
import com.tuya.connector.industry.ability.notice.model.NoticeStatus;
import com.tuya.connector.industry.ability.notice.model.NoticeTemplates;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.PUT;

public interface AppNoticeConnector {

    @PUT("/v1.0/iot-03/messages/app-notifications/actions/push")
    NoticeStatus push(@Body AppNotice appNotice);

    @POST("/v1.0/iot-03/msg-templates/voices")
    NoticeTemplates applyTemplate(@Body AppNoticeTemplate appNoticeTemplate);
}
