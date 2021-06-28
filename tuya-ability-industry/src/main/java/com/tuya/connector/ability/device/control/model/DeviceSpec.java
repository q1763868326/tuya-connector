package com.tuya.connector.ability.device.control.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Chyern
 * @date 2021/3/27
 */
@Data
public class DeviceSpec implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String category;
    private List<DeviceFunctions> functions;
    private List<DeviceStatus> status;

    @Data
    public static class DeviceFunctions implements Serializable {
        protected static final long serialVersionUID = 1L;
        private String code;
        private String desc;
        private String name;
        private String type;
        private String values;
    }

    @Data
    public static class DeviceStatus implements Serializable {
        protected static final long serialVersionUID = 1L;
        private String code;
        private String name;
        private String type;
        private String values;
    }

}
