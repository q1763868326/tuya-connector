package com.tuya.connector.ability.weather.model;

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
public class CurrentWeather implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 坐标对象
     */
    Coordinate coordinate;

    /**
     * 当前天气对象
     */
    Weather currentWeather;

    /**
     * 空气质量对象
     */
    AirQuality airQuality;

}
