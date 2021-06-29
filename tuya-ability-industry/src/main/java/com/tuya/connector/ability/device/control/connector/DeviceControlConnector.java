package com.tuya.connector.ability.device.control.connector;

import com.tuya.connector.ability.device.manage.model.DeviceCommands;
import com.tuya.connector.ability.device.control.model.DeviceSpec;
import com.tuya.connector.api.annotations.Body;
import com.tuya.connector.api.annotations.GET;
import com.tuya.connector.api.annotations.POST;
import com.tuya.connector.api.annotations.Path;

/**
 * @author Chyern
 * @date 2021/3/27
 */
public interface DeviceControlConnector {

    @GET("/v1.0/iot-03/devices/{device_id}/functions")
    DeviceSpec queryFunctionsByDeviceId(@Path("device_id") String deviceId);

    @GET("/v1.0/iot-03/devices/{device_id}/specification")
    DeviceSpec querySpecByDeviceId(@Path("device_id") String deviceId);

    @POST("/v1.0/iot-03/devices/{device_id}/commands")
    Boolean sendCommands(@Path("device_id") String deviceId, @Body DeviceCommands request);

}
