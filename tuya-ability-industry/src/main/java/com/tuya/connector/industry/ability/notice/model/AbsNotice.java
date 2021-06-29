package com.tuya.connector.industry.ability.notice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class AbsNotice implements Serializable {
    protected static final long serialVersionUID = 1L;
    /**
     * 必须填写已审核通过的模板 ID
     */
    protected String templateId;

    /**
     * 邮件模板变量对应的实际值，JSON 格式
     */
    protected String templateParam;

}