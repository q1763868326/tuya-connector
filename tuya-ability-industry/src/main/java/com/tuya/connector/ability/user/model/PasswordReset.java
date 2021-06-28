package com.tuya.connector.ability.user.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * <p> TODO
 *
 * @author 哲也
 * @since 2021/6/9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class PasswordReset implements Serializable {
    protected static final long serialVersionUID = 1L;

    String username;

    String newPassword;
}
