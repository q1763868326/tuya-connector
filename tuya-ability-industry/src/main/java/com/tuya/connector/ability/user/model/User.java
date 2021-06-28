package com.tuya.connector.ability.user.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Description  TODO
 *
 * @author Chyern
 * @date 2021/3/26
 */
@Data
public class User implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String countryCode;
    private String userId;
    private String userName;
    private String nickName;
}
