package com.tuya.connector.ability.notice.model;

import lombok.Data;

@Data
public abstract class AbsNoticePush {
    /**
     * 必须填写已审核通过的模板 ID
     */
    protected String templateId;

    /**
     * 邮件模板变量对应的实际值，JSON 格式
     */
    protected String templateParam;

}