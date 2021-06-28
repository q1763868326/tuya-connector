package com.tuya.connector.ability.device.status.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Description: TODO
 *
 * @author Chyern
 * @date 2021/3/31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class DeviceStatuses implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String id;
    private List<DeviceStatus> status;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @SuperBuilder
    public static class DeviceStatus implements Serializable {
        protected static final long serialVersionUID = 1L;
        private String code;
        private String name;
        private Object value;
    }
}
