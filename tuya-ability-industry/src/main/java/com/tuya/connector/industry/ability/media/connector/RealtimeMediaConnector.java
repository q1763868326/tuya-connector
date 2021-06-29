package com.tuya.connector.industry.ability.media.connector;

import com.tuya.connector.industry.ability.media.model.MediaLocation;
import com.tuya.connector.industry.ability.media.model.WebRTCConfig;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.Path;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/24
 */
public interface RealtimeMediaConnector {
    /**
     * 获取设备的WebRTC配置
     *
     * @param uid      用户id
     * @param deviceId 设备id
     * @return 设备的WebRTC配置
     */
    @GET("/v1.0/users/{uid}/devices/{device_id}/webrtc-configs")
    WebRTCConfig queryWebRTCConfig(@Path("uid") String uid, @Path("device_id") String deviceId);

    /**
     * 请求RTSP/HLS实时流播放地址。
     *
     * @param uid      用户id
     * @param deviceId 设备id
     * @param type     实时流协议类型
     * @return RTSP/HLS实时流播放地址
     */
    @POST("/v1.0/users/{uid}/devices/{device_id}/stream/actions/allocate")
    MediaLocation queryStreamLocation(@Path("uid") String uid, @Path("device_id") String deviceId, @Body String type);
}
