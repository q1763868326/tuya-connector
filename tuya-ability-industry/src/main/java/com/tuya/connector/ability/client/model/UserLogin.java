package com.tuya.connector.ability.client.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @author benguan
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class UserLogin implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String countryCode;
}
