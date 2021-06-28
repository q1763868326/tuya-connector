package com.tuya.connector.ability.media.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @description:
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class WebRTCConfig implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 音频属性
     */
    AudioAttrs audioAttributes;

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
    String motoId;

    /**
     * P2P配置
     */
    P2pConfig p2pConfig;

    /**
     * 技能
     */
    String skill;

    /**
     * 是否支持WebRTC
     */
    Boolean supportsWebrtc;

    /**
     * 视频清晰度
     */
    Integer vedioClarity;

}
