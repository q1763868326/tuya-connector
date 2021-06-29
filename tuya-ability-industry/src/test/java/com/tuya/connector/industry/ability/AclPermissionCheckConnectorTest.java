package com.tuya.connector.industry.ability;


import com.tuya.connector.industry.ability.acl.connector.AclPermissionCheckConnector;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class AclPermissionCheckConnectorTest extends BaseTest {
    AclPermissionCheckConnector connector = loadConnector(AclPermissionCheckConnector.class);
    @Test
    public void testQuerySpace(){
        val res = todo();
        println(res);
    }

}
