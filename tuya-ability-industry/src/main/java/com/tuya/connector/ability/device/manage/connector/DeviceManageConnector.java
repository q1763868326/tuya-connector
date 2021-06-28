package com.tuya.connector.ability.device.manage.connector;


import com.tuya.connector.ability.device.manage.model.Device;
import com.tuya.connector.ability.device.manage.model.DeviceModify;
import com.tuya.connector.ability.device.manage.model.Devices;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.DELETE;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.PUT;
import com.tuya.connector.api.annotations.Path;
import com.tuya.connector.api.annotations.Query;

/**
 *
 * @author Chyern
 * @date 2021/3/27
 */
public interface DeviceManageConnector {

    @DELETE("/v1.0/iot-03/devices/{device_id}")
    Boolean deleteDevice(@Path(("device_id")) String deviceId);

    @DELETE("/v1.0/iot-03/devices")
    Boolean deleteDevices(@Query("device_ids") String deviceIds);

    @PUT("/v1.0/iot-03/devices/{device_id}")
    Boolean modifyDevice(@Path("device_id") String deviceId, @Body DeviceModify request);

    @GET("/v1.0/iot-03/devices/{device_id}")
    Device selectDevice(@Path("device_id") String deviceId);

    @GET("/v1.0/iot-03/devices")
    Devices selectDevices(@Query("device_ids") String deviceIds);

}
