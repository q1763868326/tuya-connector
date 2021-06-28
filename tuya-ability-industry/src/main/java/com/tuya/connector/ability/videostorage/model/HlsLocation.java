package com.tuya.connector.ability.videostorage.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

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
public class HlsLocation implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 录像片段开始时间，使用 10 位时间戳表示，精确至秒
     */
    Long startTime;

    /**
     * 录像片段结束时间，使用 10 位时间戳表示，精确至秒
     */
    Long endTime;

    /**
     * 录像文件的 HLS 播放地址
     */
    String url;

}
