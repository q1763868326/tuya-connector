package com.tuya.connector.ability.geo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * @description: 地理位置-经纬度
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Builder
public class GeoCoordinate {
    String longitude;
    String latitude;
}
