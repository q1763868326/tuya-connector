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
     * 必须填写已审核通过的模板 ID
     */
    protected String template_id;

    /**
     * 邮件模板变量对应的实际值，JSON 格式
     */
    protected String template_param;
    /**
     * 收件人的地址
     */
    private String to_address;

    /**
     * 邮件的回复地址
     */
    private String reply_to_address;
}
