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
import java.util.List;

/**
 * @description:
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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
