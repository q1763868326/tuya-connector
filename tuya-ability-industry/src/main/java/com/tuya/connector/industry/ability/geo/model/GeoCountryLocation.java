package com.tuya.connector.industry.ability.geo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @description
 * @author benguan.zhou@tuya.com
 * @date 2021/05/22
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class GeoCountryLocation implements Serializable {
    protected static final long serialVersionUID = 1L;
    String countryCode;
    String nationalNumber;
    String longitude;
    String latitude;
    String continentCode;
}
