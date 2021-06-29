package com.tuya.connector.ability;


import com.tuya.connector.ability.acl.connector.AclRoleConnector;
import com.tuya.connector.ability.acl.model.AclRole;
import com.tuya.connector.ability.acl.model.AclRolesPageParam;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class AclRoleConnectorTest extends BaseTest {
    AclRoleConnector connector = loadConnector(AclRoleConnector.class);
    @Test
    public void testQueryRolesByUser(){
        val res = connector.queryRolesByUid(spaceId(),uid());
        println(res);
    }
    @Test
    public void testGetRole(){
        val res = connector.queryRoleByCode(spaceId(),"admin");
        println(res);
    }

    @Test
    public void testQueryRolesPagination(){
        val res = connector.queryPagingRoles(spaceId(),let(new AclRolesPageParam(), it->{
            it.setPageNumber(1);
            it.setPageSize(10);
            it.setRoleCode("admin");
        }));
        println(res);
    }
    @Test
    public void testCreateRole(){
        val res = connector.createRole(spaceId(),let(new AclRole(), it->{
            it.setRoleCode("admin");
            it.setRoleName("Admin");
        }));
        println(res);
    }
}
