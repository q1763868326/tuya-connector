package com.tuya.connector.industry.ability.client.connector;

import com.tuya.connector.industry.ability.asset.model.AuthorizedAsset;
import com.tuya.connector.industry.ability.client.model.UserLogin;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.Path;
import com.tuya.connector.api.annotations.Query;
import com.tuya.connector.open.api.model.PageResultWithTotal;
import com.tuya.connector.open.api.token.TuyaToken;

/**
 * @author benguan
 */
public interface ClientConnector {

    @POST("/v1.0/iot-03/users/login")
    TuyaToken login(@Body UserLogin userLogin);

    @GET("/v1.0/iot-03/users/{uid}/assets")
    PageResultWithTotal<AuthorizedAsset> queryPagingAuthorizedAssets(@Path("uid") String uid,
                                                               @Query("pageNo") int pageNo,
                                                               @Query("pageSize") int pageSize);
}
