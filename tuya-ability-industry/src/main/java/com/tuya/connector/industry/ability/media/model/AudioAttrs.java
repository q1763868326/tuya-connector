package com.tuya.connector.industry.ability.media.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.List;

/**
 * @description
 * @author benguan.zhou@tuya.com
 * @date 2021/05/24
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class AudioAttrs implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 呼叫模式
     * TODO 待确认是什么类型的list
     */
    List<Integer> callMode;

    /**
     * 硬件能力
     * TODO 待确认是什么类型的list
     */
    List<Integer> hardwareCapability;

}
