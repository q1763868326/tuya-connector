package com.tuya.connector.ability.notice.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * <p> TODO
 *
 * @author 哲也
 * @since 2021/6/9
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PushStatus implements Serializable {
    protected static final long serialVersionUID = 1L;

    boolean sendStatus;

}