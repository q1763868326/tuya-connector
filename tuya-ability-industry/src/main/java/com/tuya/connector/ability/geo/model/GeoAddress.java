package com.tuya.connector.ability.geo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * @description:
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Builder
public class GeoAddress implements Serializable {
    protected static final long serialVersionUID = 1L;
    String address;
    String latitude;
    String longitude;
}
