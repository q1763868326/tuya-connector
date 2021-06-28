package com.tuya.connector.ability.weather.model;

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
public class Weather implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 天气概况
     */
    String condition;

    /**
     * 天气概况数字编码
     */
    String conditionNum;

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
    String realFeel;

    /**
     * 紫外线指数
     */
    String uvi;

    /**
     * 风速
     */
    String windSpeed;

}
