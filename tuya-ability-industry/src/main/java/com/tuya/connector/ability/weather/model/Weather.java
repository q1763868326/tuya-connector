package com.tuya.connector.ability.weather.model;

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
public class Weather {

    /**
     * 天气概况
     */
    String condition;

    /**
     * 天气概况数字编码
     */
    String condition_num;

    /**
     * 温度
     */
    String temp;

    /**
     * 湿度（百分比）
     */
    String humidity;

    /**
     * 气压。 单位：毫巴（mbar）、百帕斯卡(hPa) 。 1mbar = 100pa = 1hpa
     */
    String pressure;

    /**
     * 体感温度
     */
    String real_feel;

    /**
     * 紫外线指数
     */
    String uvi;

    /**
     * 风速
     */
    String wind_speed;

}
