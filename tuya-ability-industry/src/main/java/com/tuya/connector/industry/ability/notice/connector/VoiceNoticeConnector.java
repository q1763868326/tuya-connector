package com.tuya.connector.industry.ability.notice.connector;

import com.tuya.connector.industry.ability.notice.model.NoticeStatus;
import com.tuya.connector.industry.ability.notice.model.NoticeTemplates;
import com.tuya.connector.industry.ability.notice.model.VoiceNotice;
import com.tuya.connector.industry.ability.notice.model.VoiceNoticeTemplate;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.POST;

public interface VoiceNoticeConnector {

    @POST("/v1.0/iot-03/messages/voices/actions/push")
    NoticeStatus push(@Body VoiceNotice request);

    @POST("/v1.0/iot-03/msg-templates/voices")
    NoticeTemplates applyTemplate(@Body VoiceNoticeTemplate voiceTemplateRequest);

}
