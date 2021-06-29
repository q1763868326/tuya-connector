package com.tuya.connector.industry.ability.videostorage.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @description
 * @author benguan.zhou@tuya.com
 * @date 2021/05/24
 */
@Data
@NoArgsConstructor
@SuperBuilder
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
