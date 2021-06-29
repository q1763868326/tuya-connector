package com.tuya.connector.industry.ability.acl.connector;

import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.Query;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/31
 */
public interface AclPermissionCheckConnector {

    @GET("/v1.0/iot-03/idaas/valid-role-permission")
    Boolean checkPermissionForRole(@Query("spaceId") String spaceId,
                                   @Query("permissionCode") String permissionCode,
                                   @Query("roleCode") String roleCode
    );

    @POST("/v1.0/iot-03/idaas/valid-user-role")
    Boolean checkRoleForUser(@Query("spaceId") String spaceId,
                             @Query("roleCode") String roleCode,
                             @Query("uid") String uid
    );

    @POST("/v1.0/iot-03/idaas/valid-user-permission")
    Boolean checkPermissionForUser(@Query("spaceId") String spaceId,
                                   @Query("permission_code") String permissionCode,
                                   @Query("uid") String uid
    );
}
