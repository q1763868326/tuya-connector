package com.tuya.connector.industry.ability.device.status.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.List;

/**
 * @author Chyern
 * @date 2021/3/31
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class DeviceStatuses implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String id;
    private List<DeviceStatus> status;

}
