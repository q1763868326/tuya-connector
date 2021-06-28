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
    private static final long serialVersionUID = 2733929104492848165L;
    private String countryCode;
    private String userId;
    private String userName;
    private String nickName;
}
