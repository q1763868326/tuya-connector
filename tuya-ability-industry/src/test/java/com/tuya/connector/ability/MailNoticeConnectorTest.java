package com.tuya.connector.ability;


import com.tuya.connector.ability.notice.connector.MailNoticeConnector;
import com.tuya.connector.ability.notice.model.MailNotice;
import com.tuya.connector.ability.notice.model.MailNoticeTemplate;
import lombok.val;
import org.junit.jupiter.api.Test;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
public class MailNoticeConnectorTest extends BaseTest {
    MailNoticeConnector connector = loadConnector(MailNoticeConnector.class);
    @Test
    public void testApplyTemplate(){
        val res = connector.applyTemplate(let(new MailNoticeTemplate(), it->{
            it.setType(1);
            //it.setStatus();
            it.setName("通-知");
            it.setTitle("TITLE");
            it.setSenderName("benguan.zhou");
            it.setContent("hello world");
            it.setRemark("HELLO WORLD");
        }));
        println(res);
    }
    @Test
    public void testGetTemplateList(){
        val res = connector.queryPagingTemplates(1,100,1);
        println(res);
        //NoticeTemplates(total=1, list=[NoticeTemplate(templateId=MAIL_4455025299, name=通-知, content=hello world, type=null, remark=null, status=0)], hasMore=false)
    }

    @Test
    public void testPush(){
        val res = connector.push(let(new MailNotice(), it->{
            it.setTemplateId("MAIL_4455025299");
            it.setToAddress("421211679@qq.com");
            it.setTemplateParam(toJSONString(mapOf("time","10点")));
        }));
        println(res);
    }

}
