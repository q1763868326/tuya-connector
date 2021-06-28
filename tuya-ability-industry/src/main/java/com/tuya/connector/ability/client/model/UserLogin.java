package com.tuya.connector.ability.client.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * @author benguan
 */
@AllArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class UserLogin implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String countryCode;
}
