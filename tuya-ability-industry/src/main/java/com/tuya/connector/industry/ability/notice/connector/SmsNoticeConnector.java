package com.tuya.connector.industry.ability.notice.connector;

import com.tuya.connector.industry.ability.notice.model.NoticeTemplates;
import com.tuya.connector.industry.ability.notice.model.NoticeStatus;
import com.tuya.connector.industry.ability.notice.model.SmsNotice;
import com.tuya.connector.industry.ability.notice.model.SmsNoticeTemplate;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.Query;

/**
 * @author 哲也
 * @since 2021/6/9
 */
public interface SmsNoticeConnector {


    @POST("/v1.0/iot-03/messages/sms/actions/push")
    NoticeStatus push(@Body SmsNotice req);


    @POST("/v1.0/iot-03/msg-templates/sms")
    SmsNoticeTemplate applyTemplate(@Body SmsNoticeTemplate smsTemplateRequest);

    @GET("/v1.0/iot-03/msg-templates/sms")
    NoticeTemplates queryPagingTemplates(@Query("page_no") int pageNo,
                                         @Query("page_size") int pageSize,
                                         @Query("sort") int sort);

}
