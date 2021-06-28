package com.tuya.connector.ability.user.model;

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
public class PasswordModify implements Serializable {
    protected static final long serialVersionUID = 1L;
    String newPassword;
    String oldPassword;
}
