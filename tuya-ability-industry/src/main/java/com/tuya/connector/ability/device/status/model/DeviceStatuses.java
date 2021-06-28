package com.tuya.connector.ability.device.status.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Description: TODO
 *
 * @author Chyern
 * @date 2021/3/31
 */
@Data
public class DeviceStatuses implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String id;
    private List<DeviceStatus> status;

    @Data
    public static class DeviceStatus implements Serializable {
        protected static final long serialVersionUID = 1L;
        private String code;
        private String name;
        private Object value;
    }
}
