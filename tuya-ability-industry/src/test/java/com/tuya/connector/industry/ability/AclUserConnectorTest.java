package com.tuya.connector.industry.ability;


import com.tuya.connector.industry.ability.acl.connector.AclUserConnector;
import com.tuya.connector.industry.ability.acl.model.AclUser;
import com.tuya.connector.industry.ability.acl.model.AclUsersPageParam;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class AclUserConnectorTest extends BaseTest {
    AclUserConnector connector = loadConnector(AclUserConnector.class);
    @Test
    public void testQueryUserPage(){
        val res = connector.queryPagingUsers(spaceId(), let(new AclUsersPageParam(), it->{
            it.setPageNumber(1);
            it.setPageSize(100);
        }));
        println(res);
    }
    @Test
    public void testCreateUser(){
        val res = connector.createUser(spaceId(), let(new AclUser(), it->{
            it.setUsername("18820077637");
            it.setUid(uid());
        }));
        println(res);
    }
}
