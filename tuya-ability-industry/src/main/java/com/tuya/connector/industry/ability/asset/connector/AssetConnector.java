package com.tuya.connector.industry.ability.asset.connector;

import com.tuya.connector.industry.ability.asset.model.Asset;
import com.tuya.connector.industry.ability.asset.model.AssetAdd;
import com.tuya.connector.industry.ability.asset.model.AssetAuthorize;
import com.tuya.connector.industry.ability.asset.model.AssetUpdate;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.DELETE;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.PUT;
import com.tuya.connector.api.annotations.Path;
import com.tuya.connector.api.annotations.Query;
import com.tuya.connector.industry.ability.asset.model.UserAsset;
import com.tuya.connector.industry.ability.asset.model.UserAssets;
import com.tuya.connector.open.api.model.PageResult;
import java.util.List;

/**
 * @author Chyern
 * @date 2021/3/10
 */
public interface AssetConnector {

    
    @POST("/v1.0/iot-02/assets")
    String addAsset(@Body AssetAdd assetAdd);

    
    @PUT("/v1.0/iot-02/assets/{asset_id}")
    Boolean updateAsset(@Path("asset_id") String assetId, @Body AssetUpdate asset);

    
    @DELETE("/v1.0/iot-02/assets/{asset_id}")
    Boolean deleteAsset(@Path("asset_id") String assetId);

    
    @GET("/v1.0/iot-02/assets/{asset_id}")
    Asset queryAssetById(@Path("asset_id") String assetId);

    
    @GET("/v1.0/iot-02/assets")
    List<Asset> queryAssetsByIds(@Query("asset_ids") String assetIds);

    
    @GET("/v1.1/iot-02/assets")
    PageResult<Asset> queryPagingAssets(@Query("asset_ids") String assetIds, @Query("asset_name") String assetName,
                                   @Query("last_row_key") String lastRowKey, @Query("page_size") Integer pageSize);

    
    @GET("/v1.0/iot-02/assets/{asset_id}/sub-assets")
    PageResult<Asset> queryPagingChildrenAssets(@Path("asset_id") String assetId, @Query("last_row_key") String lastRowKey,
                                        @Query("page_size") Integer pageSize);

    
    @GET("/v1.0/iot-02/assets/{asset_id}/devices")
    PageResult<Asset> queryPagingChildrenDevices(@Path("asset_id") String assetId, @Query("last_row_key") String lastRowKey,
                                         @Query("page_size") Integer pageSize);

    
    @POST("/v1.0/iot-03/assets/actions/user-authorized")
    Boolean authorize(@Body AssetAuthorize assetAuthorize);

    @POST("/v1.0/iot-03/users/{uid}/actions/batch-assets-authorized")
    Boolean authorizeAssetsToUser(@Path("uid") String userId, @Body UserAssets userAssets);

    @POST("/v1.0/iot-03/users/{uid}/actions/batch-assets-unauthorized")
    Boolean unAuthorizeAssetsFromUser(@Path("uid") String userId, @Body UserAssets userAssets);

    @POST("/v1.0/iot-03/users/{uid}/actions/assets-unauthorized")
    Boolean unAuthorizeAssetFromUser(@Path("uid") String userId, @Body UserAsset userAsset);



}
