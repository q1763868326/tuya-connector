package com.tuya.connector.industry.ability;

import com.alibaba.fastjson.JSON;
import com.tuya.connector.api.config.ApiDataSource;
import com.tuya.connector.api.config.Configuration;
import com.tuya.connector.api.config.Logging;
import com.tuya.connector.api.core.ConnectorFactory;
import com.tuya.connector.api.core.DefaultConnectorFactory;
import com.tuya.connector.api.header.HeaderProcessor;
import com.tuya.connector.open.api.context.TuyaContextManager;
import com.tuya.connector.open.api.header.TuyaHeaderProcessor;
import com.tuya.connector.open.api.token.TuyaTokenManager;
import com.tuya.connector.open.common.util.Sha256Util;
import com.tuya.topfunc.core.TopFunc;
import lombok.val;

import java.util.ResourceBundle;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class BaseTest implements TopFunc {
    static TopFunc $ = new TopFunc() {};
    static ResourceBundle bundle;
    public String prop(String key){
        return bundle.getString(key);
    }
    private static ConnectorFactory fac = $.also(null,it->{
        bundle = ResourceBundle.getBundle("config");
        val config = new Configuration();
        ApiDataSource dataSource = ApiDataSource.DEFAULT_BUILDER.build();
        dataSource.setBaseUrl(bundle.getString("connector.api.url"));
        dataSource.setAk(bundle.getString("connector.api.ak"));
        dataSource.setSk(bundle.getString("connector.api.sk"));
        dataSource.setLoggingStrategy(Logging.Strategy.BASIC);
        dataSource.setAutoSetHeader(true);
        HeaderProcessor headerProcessor = new TuyaHeaderProcessor(config);
        dataSource.setHeaderProcessor(headerProcessor);

        dataSource.setContextManager(new TuyaContextManager(config));

        dataSource.setAutoRefreshToken(true);
        dataSource.setTokenManager(new TuyaTokenManager(config));

        config.setApiDataSource(dataSource);
        config.init();

        return new DefaultConnectorFactory(config);
    });

    public static <T> T loadConnector(Class<T> clazz){
        return (T)fac.loadConnector(clazz);
    }

    public String username(){
        return prop("username");
    }
    public String password(){
        return Sha256Util.encryption(prop("password"));
    }
    public String uid(){
        return prop("uid");
    }
    public String spaceGroup(){
        return prop("spaceGroup");
    }
    public String spaceCode(){
        return prop("spaceCode");
    }
    public String spaceId(){
        return prop("spaceId");
    }
    public String toJSONString(Object o){
        return JSON.toJSONString(o);
    }

    public void printJSONString(Object o){
        println(toJSONString(o));
    }
}
