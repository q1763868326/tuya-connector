package com.tuya.connector.industry.ability.acl.connector;

import com.tuya.connector.industry.ability.acl.model.AclPageResult;
import com.tuya.connector.industry.ability.acl.model.AclUser;
import com.tuya.connector.industry.ability.acl.model.AclUsersPageParam;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.DELETE;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.PUT;
import com.tuya.connector.api.annotations.Path;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/31
 */
public interface AclUserConnector {

    @POST("/v1.0/iot-03/idaas/spaces/{space_id}/users")
    Boolean createUser(@Path("space_id") String spaceId, @Body AclUser aclUser);

    @PUT("/v1.0/iot-03/idaas/spaces/{space_id}/users/{uid}")
    Boolean updateUser(@Path("space_id") String spaceId,
                       @Path("uid") String uid,
                       @Body AclUser aclUser);

    @DELETE("/v1.0/iot-03/idaas/spaces/{space_id}/users/{uid}")
    Boolean deleteUser(@Path("space_id") String spaceId,
                       @Path("uid") String uid);

    @GET("/v1.0/iot-03/idaas/spaces/{space_id}/users/{uid}")
    AclUser queryUserByUid(@Path("space_id") String spaceId,
                         @Path("uid") String uid);

    @POST("/v1.0/iot-03/idaas/spaces/{space_id}/page-user")
    AclPageResult<AclUser> queryPagingUsers(@Path("space_id") String spaceId,
                                         @Body AclUsersPageParam req);


}
