package com.tuya.connector.ability.media.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * @description:
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Builder
public class WebRTCConfig {

    /**
     * 音频属性
     */
    AudioAttrs audio_attributes;

    /**
     * 授权码
     */
    String auth;

    /**
     * 设备ID
     */
    String id;

    /**
     * 信令服务ID
     */
    String moto_id;

    /**
     * P2P配置
     */
    P2pConfig p2p_config;

    /**
     * 技能
     */
    String skill;

    /**
     * 是否支持WebRTC
     */
    Boolean supports_webrtc;

    /**
     * 视频清晰度
     */
    Integer vedio_clarity;

}
