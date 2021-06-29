package com.tuya.connector.ability.acl.connector;

import com.tuya.connector.ability.acl.model.AclPermission;
import com.tuya.connector.ability.acl.model.AclPermissionCodes;
import com.tuya.connector.ability.acl.model.AclPermissions;
import com.tuya.connector.ability.acl.model.AclPermissionRoleCodes;
import com.tuya.connector.ability.acl.model.AclRole;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.DELETE;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.PUT;
import com.tuya.connector.api.annotations.Path;

import java.util.List;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/31
 */
public interface AclPermissionConnector {
    @POST("/v1.0/iot-03/idaas/spaces/{space_id}/permissions")
    Boolean createPermission(@Path("space_id") String spaceId, @Body AclPermission aclPermission);

    @POST("/v1.0/iot-03/idaas/spaces/{space_id}/add-batch-permission")
    Boolean createPermissions(@Path("space_id") String spaceId, @Body AclPermissions aclPermissions);

    @PUT("/v1.0/iot-03/idaas/spaces/{space_id}/permissions/{permission_code}")
    Boolean updatePermission(@Path("space_id") String spaceId,
                             @Path("permission_code") String permissionCode,
                             @Body AclPermission aclPermission);

    @DELETE("/v1.0/iot-03/idaas/spaces/{space_id}/permissions/{permission_code}")
    Boolean deletePermission(@Path("space_id") String spaceId, @Path("permission_code") String permissionCode);

    @GET("/v1.0/iot-03/idaas/spaces/{space_id}/permissions/{permission_code}")
    AclPermission queryPermissionByCode(@Path("space_id") String spaceId, @Path("permission_code") String permissionCode);

    @POST("/v1.0/iot-03/idaas/spaces/{space_id}/get-batch-permission")
    List<AclPermission> queryPermissionsByCodes(@Path("space_id") String spaceId, @Body AclPermissionCodes aclPermissionCodes);

    @POST("/v1.0/iot-03/idaas/spaces/{space_id}/get-batch-role-permission")
    List<AclRole> queryPermissionsByRoleCodes(@Path("space_id") String spaceId,
                                              @Body AclPermissionRoleCodes request);

    @GET("/v1.0/iot-03/idaas/spaces/{space_id}/users/{uid}/permissions")
    List<AclPermission> queryPermissionsByUid(@Path("space_id") String spaceId,
                                               @Path("uid") String uid);
}
