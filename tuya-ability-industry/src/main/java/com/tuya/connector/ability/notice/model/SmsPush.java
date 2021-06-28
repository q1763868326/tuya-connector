package com.tuya.connector.ability.notice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p> TODO
 *
 * @author 哲也
 * @since 2021/6/9
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SmsPush extends AbsNoticePush implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 国家码
     */
    private String countryCode;
    /**
     * 接收短信的手机号码
     */
    private String phone;
}
