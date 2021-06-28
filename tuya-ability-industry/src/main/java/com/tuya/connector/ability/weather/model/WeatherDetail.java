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
public class WeatherDetail {

    /**
     * 预报的天时间戳
     */
    Long time;

    /**
     * zoneId
     */
    String zone_id;

    /**
     * 实时天气
     */
    String condition;

    /**
     * 天气数值类型 code
     */
    Integer condition_num;

    /**
     * thunderstorm:雷暴,drizzle:细雨, rain:雨,snow:雪,atmosphere:大气,clear:晴朗,clouds:云
     */
    String brief_condition;

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
    String temp_unit;

    /**
     * 当日最低气温（只在按天预报的数据中有值）
     * TODO 和文档不一致
     */
    Temperature temperature_min;

    /**
     * 当日最高气温（只在按天预报的数据中有值）
     * TODO 和文档不一致
     */
    Temperature temperature_max;

    /**
     * 体感温度
     */
    String real_feel;

    /**
     * 当日最低体感温度（只在按天预报的数据中有值）
     * TODO 和文档不一致
     */
    Temperature apparent_temperature_min;

    /**
     * 当日最高体感温度（只在按天预报的数据中有值）
     * TODO 和文档不一致
     */
    Temperature apparent_temperature_max;

    /**
     * 日出时间，时间戳
     */
    Long sunrise_inst;

    /**
     * 日落时间(时间戳)
     */
    Long sunset_inst;

    /**
     * 日出时间，当地时间 “yyyy-MM-dd HH:mm”
     */
    String sun_rise;

    /**
     * 日落时间(当地时间) “yyyy-MM-dd HH:mm”
     */
    String sun_set;

    /**
     * 风速
     */
    String wind_speed;

    /**
     * 风向
     */
    String wind_dir;

    /**
     * 紫外线强度
     */
    String uvi;

}
