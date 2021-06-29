package com.tuya.connector.ability;


import com.tuya.connector.ability.asset.connector.AssetConnector;
import com.tuya.connector.ability.asset.model.AssetAdd;
import com.tuya.connector.ability.asset.model.AssetAuthorize;
import com.tuya.connector.ability.asset.model.AssetUpdate;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class AssetConnectorTest extends BaseTest {
    AssetConnector connector = loadConnector(AssetConnector.class);
    @Test
    public void testAssetAuthorize(){
        val res = connector.authorize(AssetAuthorize.builder()
                .assetId("1409507897569787904")
                .uid(uid())
                .authorizedChildren(true)
                .build());
        println(res);
    }
    @Test
    public void testAddTopAsset(){
        val res = connector.addAsset(AssetAdd.builder()
                //.metaId("9527")
                .name("电风扇2")
                .build());
        //1409495888224657408
        //1409504161099227136
        println(res);
    }
    @Test
    public void testAddAsset(){
        val res = connector.addAsset(AssetAdd.builder()
                //.metaId("9528")//这个参数是不是不需要？
                .name("电风扇叶子")
                .parentAssetId("1409495888224657408")
                .build());
        //1409496261530296320
        println(res);
    }
    @Test
    public void testModifyAsset(){
        val res = connector.updateAsset("1409496261530296320", AssetUpdate.builder()
                //.metaId("9529")
                .name("电风扇-叶子")
                .build());
        println(res);
    }
    @Test
    public void testSelectAsset(){
        val res = connector.queryAssetById("1409507897569787904");
        println(res);
    }
    @Test
    public void testSelectAssets(){
        val res = connector.queryAssetsByIds("1409496261530296320,1409495888224657408");
        println(res);
    }

    @Test
    public void testSelectChildAssets(){
        val res = connector.queryPagingChildrenAssets("-1","",100);
        println(res);
    }

}
