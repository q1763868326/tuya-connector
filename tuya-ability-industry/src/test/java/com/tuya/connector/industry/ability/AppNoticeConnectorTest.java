package com.tuya.connector.industry.ability;

import com.tuya.connector.industry.ability.notice.connector.AppNoticeConnector;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class AppNoticeConnectorTest extends BaseTest {
    AppNoticeConnector connector = loadConnector(AppNoticeConnector.class);
    @Test
    public void testQuerySpace(){
        val res = todo();
        println(res);
    }

}
