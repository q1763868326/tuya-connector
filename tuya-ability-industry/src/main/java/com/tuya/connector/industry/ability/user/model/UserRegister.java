package com.tuya.connector.industry.ability.user.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * Description
 * @author Chyern
 * @date 2021/3/26
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class UserRegister implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String nickName;
    private String countryCode;

}
