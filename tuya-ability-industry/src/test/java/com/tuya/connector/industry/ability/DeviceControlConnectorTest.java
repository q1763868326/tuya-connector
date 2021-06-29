package com.tuya.connector.industry.ability;


import com.tuya.connector.industry.ability.device.control.connector.DeviceControlConnector;
import com.tuya.connector.industry.ability.device.manage.model.DeviceCommand;
import com.tuya.connector.industry.ability.device.manage.model.DeviceCommands;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class DeviceControlConnectorTest extends BaseTest {
    DeviceControlConnector connector = loadConnector(DeviceControlConnector.class);

    @Test
    public void testQueryFunctionsByDeviceId() {
        val res = connector.queryFunctionsByDeviceId("vdevo162150896760127");
        println(res);
        //DeviceSpec(category=hps, functions=[DeviceFunction(code=sensitivity, desc=灵敏度, name=灵敏度, type=Integer, values={"min":0,"max":9,"scale":0,"step":1}), DeviceFunction(code=near_detection, desc=最近距离检测, name=最近距离检测, type=Integer, values={"unit":"cm","min":0,"max":1000,"scale":0,"step":1}), DeviceFunction(code=far_detection, desc=最远距离检测, name=最远距离检测, type=Integer, values={"unit":"cm","min":0,"max":1000,"scale":0,"step":1}), DeviceFunction(code=self_checking, desc=设备自检, name=设备自检, type=Boolean, values={})], status=null)
    }

    @Test
    public void testQuerySpecByDeviceId() {
        val res = connector.querySpecByDeviceId("vdevo162150896760127");
        println(res);
    }

    @Test
    public void testSendCommands() {
        val res = connector.sendCommands("vdevo162150896760127", let(new DeviceCommands(), it -> {
            it.setCommands(listOf(
                    let(new DeviceCommand(), cmd -> {
                        cmd.setCode("sensitivity");
                        cmd.setValue(8);
                    })
            ));
        }));
        println(res);
    }
}
