package com.tuya.connector.industry.ability.notice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @author 哲也
 * @since 2021/6/9
 */
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SmsNotice extends AbsNotice implements Serializable {
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
