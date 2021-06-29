package com.tuya.connector.ability;


import com.tuya.connector.ability.notice.connector.SmsNoticeConnector;
import com.tuya.connector.ability.notice.model.SmsNotice;
import com.tuya.connector.ability.notice.model.SmsNoticeTemplate;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class SmsNoticeConnectorTest extends BaseTest {
    SmsNoticeConnector connector = loadConnector(SmsNoticeConnector.class);
    @Test
    public void testApplyTemplate(){
        val res = connector.applyTemplate(let(new SmsNoticeTemplate(),it->{
            it.setType(1);
            //it.setStatus();
            it.setName("通-知");
            it.setContent("hello world");
            it.setRemark("HELLO WORLD");
        }));
        println(res);
    }
    @Test
    public void testGetTemplateList(){
        val res = connector.queryPagingTemplates(1,100,1);
        println(res);
    }

    @Test
    public void testPush(){
        val res = connector.push(let(new SmsNotice(), it->{
            it.setTemplateId("SMS_9223372036");
            it.setPhone("18820077637");
            it.setCountryCode("86");
            it.setTemplateParam(toJSONString(mapOf("time","10点")));
        }));
        println(res);
    }

}
