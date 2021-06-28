package com.tuya.connector.ability.device.manage.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Description  TODO
 *
 * @author Chyern
 * @date 2021/3/27
 */
@Data
public class Devices implements Serializable {

    private static final long serialVersionUID = -729531291068553925L;
    private List<Device> list;
    private Boolean has_more;
    private Integer total;
}
