package com.tuya.connector.ability.notice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

@Data
@NoArgsConstructor
@SuperBuilder
public class NoticeStatus implements Serializable {
    protected static final long serialVersionUID = 1L;

    boolean sendStatus;

}