package com.tuya.connector.industry.ability.media.model;

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
public class MediaLocation implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 实时流播放地址
     */
    String url;

}
