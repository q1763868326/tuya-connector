package com.tuya.connector.ability.device.manage.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chyern
 * @date 2021/3/27
 */
@Data
@SuperBuilder
public class DeviceCommands implements Serializable {
    protected static final long serialVersionUID = 1L;
    private List<DeviceCommand> commands;

    public DeviceCommands() {
        this.commands = new ArrayList<>();
    }
}
