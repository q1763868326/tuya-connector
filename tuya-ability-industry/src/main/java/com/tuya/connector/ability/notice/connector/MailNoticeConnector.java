package com.tuya.connector.ability.notice.connector;

import com.tuya.connector.ability.notice.model.MailNotice;
import com.tuya.connector.ability.notice.model.MailNoticeTemplate;
import com.tuya.connector.ability.notice.model.NoticeStatus;
import com.tuya.connector.ability.notice.model.NoticeTemplates;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.Query;

/**
 * <p> TODO
 *
 * @author 哲也
 * @since 2021/4/13
 */
public interface MailNoticeConnector {

    @POST("/v1.0/iot-03/messages/mails/actions/push")
    NoticeStatus push(@Body MailNotice mailPushRequest);

    @POST("/v1.0/iot-03/msg-templates/mails")
    MailNoticeTemplate applyTemplate(@Body MailNoticeTemplate mailTemplateReq);

    @GET("/v1.0/iot-03/msg-templates/mails")
    NoticeTemplates getTemplateList(@Query("page_no") int pageNo,
                                             @Query("page_size") int pageSize,
                                             @Query("sort") int sort);
}
