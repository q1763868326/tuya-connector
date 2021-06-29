package com.tuya.connector.industry.ability.countrycode.connector;

import com.tuya.connector.industry.ability.countrycode.model.Country;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.Query;

import java.util.List;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/24
 */
public interface CountryCodeConnector {
    /**
     * 查询所有国家,国家名称的语言由lang指定
     *
     * @param lang 语言，比如zh
     * @return 所有国家
     */

    @GET("/v3.0/iot-03/all-countries")
    List<Country> queryCountrysByLang(@Query("lang") String lang);
}
