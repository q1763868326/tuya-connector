package com.tuya.connector.ability.weather.model;

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
public class WeatherDailyForecast implements Serializable {
    protected static final long serialVersionUID = 1L;
    Coordinate coordinate;
    List<WeatherDetail> data;
}
