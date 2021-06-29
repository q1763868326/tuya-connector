package com.tuya.connector.ability.geo.connector;

import com.tuya.connector.ability.geo.model.GeoAddress;
import com.tuya.connector.ability.geo.model.GeoCountryLocation;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.Query;

/**
 * @author benguan.zhou@tuya.com
 * @description 地理位置服务
 * @date 2021/05/22
 */
public interface GeoConnector {
    @GET("/v1.0/iot-03/geocode-cities/latitude-longitude")
    GeoAddress reverse(@Query("longitude") String lon, @Query("latitude") String lat);

    @GET("/v1.0/iot-03/geocode-cities/address")
    GeoAddress parse(@Query("address") String address);

    /**
     * 根据ip获取位置（ip定位）
     */
    @GET("/v1.0/iot-03/locations/ip")
    GeoCountryLocation location(@Query("ip") String ip);

}
