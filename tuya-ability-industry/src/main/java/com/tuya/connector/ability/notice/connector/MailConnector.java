package com.tuya.connector.ability.notice.connector;

import com.tuya.connector.ability.notice.model.MailPush;
import com.tuya.connector.ability.notice.model.PushStatus;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.POST;
/**
 * <p> TODO
 *
 * @author 哲也
 * @since 2021/6/9
 */
public interface MailConnector {

    @POST("/v1.0/iot-03/messages/mails/actions/push")
    PushStatus push(@Body MailPush request);
}
