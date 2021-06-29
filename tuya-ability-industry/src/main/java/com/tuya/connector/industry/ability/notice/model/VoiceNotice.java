package com.tuya.connector.industry.ability.notice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class VoiceNotice extends AbsNotice implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 国家码
     */
    String countryCode;

    /**
     * 接收语音通知的手机号码
     */
    String phone;

}
