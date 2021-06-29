package com.tuya.connector.industry.ability.device.manage.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/29
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class DeviceCommand implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private Object value;
}