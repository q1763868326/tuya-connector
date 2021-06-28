package com.tuya.connector.ability.geo.model;

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
 * @date: 2021/05/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GeoCountryLocation implements Serializable {
    protected static final long serialVersionUID = 1L;
    String countryCode;
    String nationalNumber;
    String longitude;
    String latitude;
    String continentCode;
}
