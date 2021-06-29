package com.tuya.connector.ability.notice.model;

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
public class MailNotice extends AbsNotice implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 收件人的地址
     */
    private String toAddress;

    /**
     * 邮件的回复地址
     */
    private String replyToAddress;
}
