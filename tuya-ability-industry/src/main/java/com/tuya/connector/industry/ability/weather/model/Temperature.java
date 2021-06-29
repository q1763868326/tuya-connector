package com.tuya.connector.industry.ability.weather.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @description
 * @author benguan.zhou@tuya.com
 * @date 2021/05/25
 */
@Data
@NoArgsConstructor

@SuperBuilder
public class Temperature implements Serializable {
    protected static final long serialVersionUID = 1L;
    String value;
}
