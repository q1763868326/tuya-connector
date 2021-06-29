package com.tuya.connector.ability.notice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
public class NoticeTemplate implements Serializable {
    protected static final long serialVersionUID = 1L;

    private String templateId;
    /**
     * 模板名称，长度为1~30 个字符
     */
    private String name;

    /**
     * 模板内容，长度为1~100 个字符
     */
    private String content;
    /**
     * 通知栏推送类型，0：运营消息 1：系统消息
     */
    private Integer type;
    /**
     * 通知栏推送模板申请说明。
     */
    private String remark;

    private Integer status;
}
