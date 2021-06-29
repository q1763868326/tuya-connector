package com.tuya.connector.industry.ability;

import com.tuya.connector.industry.ability.acl.connector.AclPermissionConnector;
import com.tuya.connector.industry.ability.acl.enums.AclPermissionType;
import com.tuya.connector.industry.ability.acl.model.AclPermission;
import com.tuya.connector.industry.ability.acl.model.AclPermissions;
import lombok.SneakyThrows;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class AclPermissionConnectorTest extends BaseTest {
    AclPermissionConnector connector = loadConnector(AclPermissionConnector.class);
    @Test
    public void testCreatePermission(){
        val res = connector.createPermission(spaceId(),let(new AclPermission(), it->{
            it.setPermissionCode("0000");
            it.setName("app");
            it.setType(AclPermissionType.menu.getCode());
        }));
        println(res);
    }
    @Test
    @SneakyThrows
    public void testGetPermissionByCode(){
        val res = connector.queryPermissionByCode(spaceId(), "0000");
        println(res);
    }

    @Test
    @SneakyThrows
    public void testBatchCreatePermission(){
        val res = connector.createPermissions(spaceId(),let(new AclPermissions(), it->{
            it.setPermissionList(listOf(
                    let(new AclPermission(),p->{
                        p.setPermissionCode("0000-0001");
                        p.setParentCode("0000");
                        p.setName("二");
                        p.setType(AclPermissionType.menu.getCode());
                    })
            ));
        }));
        println(res);
    }
}
