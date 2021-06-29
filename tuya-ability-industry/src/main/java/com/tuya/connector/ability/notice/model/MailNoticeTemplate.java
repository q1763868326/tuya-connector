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
public class MailNoticeTemplate extends NoticeTemplate implements Serializable {
    protected static final long serialVersionUID = 1L;
    String title;
    String senderName;
}
