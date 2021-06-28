package com.tuya.connector.ability.asset.connector;

import com.tuya.connector.ability.asset.model.Asset;
import com.tuya.connector.ability.asset.model.AssetCreate;
import com.tuya.connector.ability.asset.model.AssetAuthorizationRequest;
import com.tuya.connector.ability.asset.model.AssetModify;
import com.tuya.connector.ability.asset.model.AuthorizedAsset;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.DELETE;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.PUT;
import com.tuya.connector.api.annotations.Path;
import com.tuya.connector.api.annotations.Query;
import com.tuya.connector.open.api.model.PageResult;
import com.tuya.connector.open.api.model.PageResultWithTotal;
import java.util.List;

/**
 * Description  TODO
 *
 * @author Chyern
 * @date 2021/3/10
 */
public interface AssetConnector {

    
    @POST("/v1.0/iot-02/assets")
    String addAsset(@Body AssetCreate request);

    
    @PUT("/v1.0/iot-02/assets/{asset_id}")
    Boolean modifyAsset(@Path("asset_id") String assetId, @Body AssetModify body);

    
    @DELETE("/v1.0/iot-02/assets/{asset_id}")
    Boolean deleteAsset(@Path("asset_id") String assetId);

    
    @GET("/v1.0/iot-02/assets/{asset_id}")
    Asset selectAsset(@Path("asset_id") String assetId);

    
    @GET("/v1.0/iot-02/assets")
    List<Asset> selectAssets(@Query("asset_ids") String assetIds);

    
    @GET("/v1.1/iot-02/assets")
    PageResult<Asset> selectAssets(@Query("asset_ids") String assetIds, @Query("asset_name") String assetName,
                                   @Query("last_row_key") String lastRowKey, @Query("page_size") Integer pageSize);

    
    @GET("/v1.0/iot-02/assets/{asset_id}/sub-assets")
    PageResult<Asset> selectChildAssets(@Path("asset_id") String assetId, @Query("last_row_key") String lastRowKey,
                                        @Query("page_size") String pageSize);

    
    @GET("/v1.0/iot-02/assets/{asset_id}/devices")
    PageResult<Asset> selectChildDevices(@Path("asset_id") String assetId, @Query("last_row_key") String lastRowKey,
                                         @Query("page_size") String pageSize);

    
    @POST("/v1.0/iot-03/assets/actions/user-authorized")
    Boolean authorized(@Body AssetAuthorizationRequest assetAuthorizationRequest);


}
