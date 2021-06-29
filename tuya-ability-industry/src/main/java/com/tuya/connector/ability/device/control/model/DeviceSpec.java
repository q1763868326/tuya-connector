package com.tuya.connector.ability.device.control.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Chyern
 * @date 2021/3/27
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class DeviceSpec implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String category;
    private List<DeviceFunction> functions;
    private List<DeviceStatus> status;

}
