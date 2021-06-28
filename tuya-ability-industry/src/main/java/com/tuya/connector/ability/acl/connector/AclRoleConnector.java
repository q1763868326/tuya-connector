package com.tuya.connector.ability.acl.connector;

import com.tuya.connector.ability.acl.model.AclPageResult;
import com.tuya.connector.ability.acl.model.AclRole;
import com.tuya.connector.ability.acl.model.RoleUpdateReq;
import com.tuya.connector.ability.acl.model.AclRolePageQuery;
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
public interface AclRoleConnector {

    @POST("/v1.0/iot-03/idaas/spaces/{space_id}/roles")
    
    Boolean createRole(@Path("space_id") String spaceId, @Body AclRole aclRole);

    @PUT("/v1.0/iot-03/idaas/spaces/{space_id}/roles/{role_code}")
    
    Boolean updateRole(@Path("space_id") String spaceId,
                       @Path("role_code")String roleCode,
                       @Body RoleUpdateReq request);

    @DELETE("/v1.0/iot-03/idaas/spaces/{space_id}/roles/{role_code}")
    
    Boolean deleteRole(@Path("space_id") String spaceId,
                       @Path("role_code")String roleCode);

    @GET("/v1.0/iot-03/idaas/spaces/{space_id}/roles/{role_code}")
    AclRole getRole(@Path("space_id")String spaceId, @Path("role_code")String roleCode);

/*    @POST("/v1.0/iot-03/idaas/get-batch-role")
    
    List<IdaasRole> queryRolesByCodes(@Body RoleQueryReq request);*/

    @GET("/v1.0/iot-03/idaas/spaces/{space_id}/users/{uid}/roles")
    List<AclRole> queryRolesByUser(@Path("space_id")String spaceId,
                                   @Path("uid")String uid);

    @POST("/v1.0/iot-03/idaas/spaces/{space_id}/page-role")
    AclPageResult<AclRole> queryRolesPagination(@Path("space_id")String spaceId,
                                                @Body AclRolePageQuery aclRolePageQuery);
}
