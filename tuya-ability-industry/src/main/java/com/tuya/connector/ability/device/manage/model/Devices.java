package com.tuya.connector.ability.device.manage.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.List;

/**
 * @author Chyern
 * @date 2021/3/27
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class Devices implements Serializable {
    protected static final long serialVersionUID = 1L;
    private List<Device> list;
    private Boolean hasMore;
    private Integer total;
}
