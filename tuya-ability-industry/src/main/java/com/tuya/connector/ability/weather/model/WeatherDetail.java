package com.tuya.connector.ability.weather.model;

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
public class WeatherDetail implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 预报的天时间戳
     */
    Long time;

    /**
     * zoneId
     */
    String zoneId;

    /**
     * 实时天气
     */
    String condition;

    /**
     * 天气数值类型 code
     */
    Integer conditionNum;

    /**
     * thunderstorm:雷暴,drizzle:细雨, rain:雨,snow:雪,atmosphere:大气,clear:晴朗,clouds:云
     */
    String briefCondition;

    /**
     * 湿度
     */
    String humidity;

    /**
     * 气压
     */
    String pressure;

    /**
     * 温度 （小时 和 实时 时具有）
     */
    String temp;

    /**
     * 温度单位 f / c
     */
    String tempUnit;

    /**
     * 当日最低气温（只在按天预报的数据中有值）
     * TODO 和文档不一致
     */
    Temperature temperatureMin;

    /**
     * 当日最高气温（只在按天预报的数据中有值）
     * TODO 和文档不一致
     */
    Temperature temperatureMax;

    /**
     * 体感温度
     */
    String realFeel;

    /**
     * 当日最低体感温度（只在按天预报的数据中有值）
     * TODO 和文档不一致
     */
    Temperature apparentTemperatureMin;

    /**
     * 当日最高体感温度（只在按天预报的数据中有值）
     * TODO 和文档不一致
     */
    Temperature apparentTemperatureMax;

    /**
     * 日出时间，时间戳
     */
    Long sunriseInst;

    /**
     * 日落时间(时间戳)
     */
    Long sunsetInst;

    /**
     * 日出时间，当地时间 “yyyy-MM-dd HH:mm”
     */
    String sunRise;

    /**
     * 日落时间(当地时间) “yyyy-MM-dd HH:mm”
     */
    String sunSet;

    /**
     * 风速
     */
    String windSpeed;

    /**
     * 风向
     */
    String windDir;

    /**
     * 紫外线强度
     */
    String uvi;

}
