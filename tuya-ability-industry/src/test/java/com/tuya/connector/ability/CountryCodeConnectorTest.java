package com.tuya.connector.ability;


import com.tuya.connector.ability.countrycode.connector.CountryCodeConnector;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class CountryCodeConnectorTest extends BaseTest {
    CountryCodeConnector connector = loadConnector(CountryCodeConnector.class);
    @Test
    public void testListCountriesByLang(){
        println(toJSONString(connector.queryCountrysByLang("zh")));
        //contract not exist or expired 没有开通对应的openapi
    }
}
