package com.tuya.connector.ability.notice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p> TODO
 *
 * @author 哲也
 * @since 2021/6/9
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MailPush extends AbsNoticePush{

    /**
     * 收件人的地址
     */
    private String toAddress;

    /**
     * 邮件的回复地址
     */
    private String replyToAddress;
}
