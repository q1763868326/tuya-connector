package com.tuya.connector.ability;


import com.tuya.connector.ability.acl.connector.AclSpaceConnector;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class VoiceNoticeConnectorTest extends BaseTest {
    AclSpaceConnector connector = loadConnector(AclSpaceConnector.class);
    @Test
    public void test(){
        val res = connector.querySpace(spaceGroup(),spaceCode());
        println(res);
    }

}
