package com.tuya.connector.ability.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * Description  TODO
 *
 * @author Chyern
 * @date 2021/3/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserRegistry implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String nickName;
    private String countryCode;

}
