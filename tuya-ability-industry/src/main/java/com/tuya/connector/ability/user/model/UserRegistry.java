package com.tuya.connector.ability.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Builder
public class UserRegistry implements Serializable {

    private static final long serialVersionUID = 7026392351794858299L;
    private String username;
    private String password;
    private String nickName;
    private String countryCode;

}
