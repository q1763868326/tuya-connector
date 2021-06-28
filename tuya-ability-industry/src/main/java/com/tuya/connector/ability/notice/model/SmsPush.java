package com.tuya.connector.ability.notice.model;

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
public class SmsPush extends AbsNoticePush{
    /**
     * 必须填写已审核通过的模板 ID
     */
    protected String template_id;

    /**
     * 邮件模板变量对应的实际值，JSON 格式
     */
    protected String template_param;
    /**
     * 国家码
     */
    private String country_code;
    /**
     * 接收短信的手机号码
     */
    private String phone;
}
