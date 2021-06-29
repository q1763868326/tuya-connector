package com.tuya.connector.ability.videostorage.connector;

import com.tuya.connector.ability.videostorage.model.HlsKey;
import com.tuya.connector.ability.videostorage.model.HlsLocation;
import com.tuya.connector.ability.videostorage.model.HlsStreamTimeline;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.Path;

import java.util.List;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/24
 */
public interface VideoStorageConnector {

    /**
     * 获取云存储录像片段的起始时间
     *
     * @param uid      用户id
     * @param deviceId 设备id
     * @return 云存储录像片段的起始时间
     */
    @GET("/v1.0/users/{uid}/devices/{device_id}/storage/stream/timeline")
    List<HlsStreamTimeline> queryStreamTimeline(@Path("uid") String uid, @Path("device_id") String deviceId);


    /**
     * @param magic 随机字符串
     */
    @GET("/v1.0/users/{uid}/devices/{device_id}/storage/stream/key")
    HlsKey queryStreamKey(@Path("uid") String uid, @Path("device_id") String deviceId, @Path("magic") String magic);

    /**
     * 获取云存储录像片段的播放资源
     */
    @GET("/v1.0/users/{uid}/devices/{device_id}/storage/stream/hls")
    List<HlsLocation> queryStreamHls(@Path("uid") String uid, @Path("device_id") String deviceId);
}
