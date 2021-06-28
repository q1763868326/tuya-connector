package com.tuya.connector.ability.media.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.List;

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
public class AudioAttrs {

    /**
     * 呼叫模式
     * TODO 待确认是什么类型的list
     */
    List<Integer> call_mode;

    /**
     * 硬件能力
     * TODO 待确认是什么类型的list
     */
    List<Integer> hardware_capability;

}
