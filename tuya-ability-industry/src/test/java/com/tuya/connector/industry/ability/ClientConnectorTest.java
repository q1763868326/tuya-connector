package com.tuya.connector.industry.ability;


import com.tuya.connector.industry.ability.client.connector.ClientConnector;
import com.tuya.connector.industry.ability.client.model.UserLogin;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class ClientConnectorTest extends BaseTest{
    ClientConnector connector = loadConnector(ClientConnector.class);
    @Test
    public void testLogin(){
        val res = connector.login(UserLogin.builder()
                .countryCode("86")
                .username(username())
                .password(password())
                .build());
        println(res);
    }
    @Test
    public void testQueryAuthorizedAssets(){
        println(connector.queryPagingAuthorizedAssets(uid(),1,10));
        //PageResultWithTotal(list=[AuthorizedAsset(assetId=1401811577799196672, parentAssetId=-1, assetName=the-13th-floor, level=0), AuthorizedAsset(assetId=1409495888224657408, parentAssetId=-1, assetName=电风扇, level=0), AuthorizedAsset(assetId=1409496261530296320, parentAssetId=1409495888224657408, assetName=电风扇-叶子, level=1)], hasMore=false, total=3)
    }
}
