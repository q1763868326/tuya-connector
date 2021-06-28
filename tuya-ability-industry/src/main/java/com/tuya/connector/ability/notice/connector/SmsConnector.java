package com.tuya.connector.ability.notice.connector;

import com.tuya.connector.ability.notice.model.NoticeTemplates;
import com.tuya.connector.ability.notice.model.PushStatus;
import com.tuya.connector.ability.notice.model.SmsPush;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.Query;

/**
 * <p> TODO
 *
 * @author 哲也
 * @since 2021/6/9
 */
public interface SmsConnector {

    
    @POST("/v1.0/iot-03/messages/sms/actions/push")
    PushStatus push(@Body SmsPush req);

    
    @GET("/v1.0/iot-03/msg-templates/sms")
    NoticeTemplates getTemplateList(@Query("page_no") int pageNo,
                                    @Query("page_size") int pageSize,
                                    @Query("sort") int sort);
}
