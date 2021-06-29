package com.tuya.connector.ability;


import com.tuya.connector.ability.acl.connector.AclGrantConnector;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class AclGrantConnectorTest extends BaseTest {
    AclGrantConnector connector = loadConnector(AclGrantConnector.class);
    @Test
    public void testQuerySpace(){
        val res = todo();
        println(res);
    }

}
