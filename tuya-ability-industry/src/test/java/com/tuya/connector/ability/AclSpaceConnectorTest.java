package com.tuya.connector.ability;


import com.tuya.connector.ability.acl.connector.AclSpaceConnector;
import com.tuya.connector.ability.acl.model.AclSpace;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class AclSpaceConnectorTest extends BaseTest {
    AclSpaceConnector connector = loadConnector(AclSpaceConnector.class);
    @Test
    public void testQuerySpace(){
        val res = connector.querySpace(spaceGroup(),spaceCode());
        println(res);
        //签名错误？
    }
    @Test
    public void testApplySpace(){
        val res = connector.applySpace(let(new AclSpace(), it->{
            it.setSpaceGroup(spaceGroup());
            it.setSpaceCode(spaceCode());
            it.setAuthentication(2);
            it.setOwnerList(listOf("benguan"));
            //1409761950438527074
        }));
        println(res);
    }

}
