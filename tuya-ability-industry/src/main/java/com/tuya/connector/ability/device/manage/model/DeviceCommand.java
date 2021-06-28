package com.tuya.connector.ability.device.manage.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Description  TODO
 *
 * @author Chyern
 * @date 2021/3/27
 */
@Data
public class DeviceCommand implements Serializable {
    protected static final long serialVersionUID = 1L;
    private List<Command> commands;

    public DeviceCommand() {
        this.commands = new ArrayList<>();
    }

    @Data
    public static class Command implements Serializable {
        private static final long serialVersionUID = -5973828433334266216L;
        private String code;
        private Object value;
    }
}
