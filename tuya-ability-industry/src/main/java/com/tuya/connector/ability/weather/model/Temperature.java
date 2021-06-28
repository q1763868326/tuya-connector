package com.tuya.connector.ability.weather.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @description:
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Temperature implements Serializable {
    protected static final long serialVersionUID = 1L;
    String value;
}
