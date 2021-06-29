package com.tuya.connector.industry.ability.acl.connector;

import com.tuya.connector.industry.ability.acl.model.AclRolePermission;
import com.tuya.connector.industry.ability.acl.model.AclRolePermissions;
import com.tuya.connector.industry.ability.acl.model.AclUserRole;
import com.tuya.connector.industry.ability.acl.model.AclUserRoles;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.DELETE;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.Query;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/31
 */
public interface AclGrantConnector {

    @POST("/v1.0/iot-03/idaas/role-permission")
    Boolean grantPermissionToRole(@Body AclRolePermission aclRolePermission);

    @POST("/v1.0/iot-03/idaas/role-batch-permission")
    Boolean grantPermissionsToRole(@Body AclRolePermissions aclRolePermissions);

    /**
     * not supported yet!
     */
/*    @PUT("/v1.0/iot-03/idaas/role-batch-permission")
    Boolean setPermissionsToRole(@Body RolePermissions rolePermissions);*/
    @DELETE("/v1.0/iot-03/idaas/role-permission")
    Boolean revokePermissionFromRole(@Query("spaceId") String spaceId,
                                     @Query("permissionCode") String permissionCode,
                                     @Query("roleCode") String roleCode);

    @POST("/v1.0/iot-03/idaas/delete-role-batch-permission")
    Boolean revokePermissionsFromRole(@Body AclRolePermissions aclRolePermissions);

    @POST("/v1.0/iot-03/idaas/user-role")
    Boolean grantRoleToUser(@Body AclUserRole aclUserRole);

    @POST("/v1.0/iot-03/idaas/user-batch-role")

    //Boolean setRolesToUser(@Body AclUserRoles aclUserRoles);

    @DELETE("/v1.0/iot-03/idaas/user-role")
    Boolean revokeRoleFromUser(@Query("space_id") String spaceId,
                               @Query("role_code") String roleCode,
                               @Query("uid") String uid);

    @POST("/v1.0/iot-03/idaas/delete-user-batch-role")
    Boolean revokeRolesFromUser(@Body AclUserRoles aclUserRoles);
}
