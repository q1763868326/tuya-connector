package com.tuya.connector.ability.device.manage.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
@Data
public class Device implements Serializable {

    private static final long serialVersionUID = -7824240582799706125L;
    private int active_time;
    private String asset_id;
    private String category;
    private int create_time;
    private String icon;
    private String id;
    private String ip;
    private String lat;
    private String local_key;
    private String lon;
    private String name;
    private boolean online;
    private String product_id;
    private String product_name;
    private boolean sub;
    private String time_zone;
    private int update_time;
    private String uuid;
}