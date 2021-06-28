package com.tuya.connector.ability.notice.model;

import lombok.Data;

@Data
public abstract class AbsNoticePush {

    protected String templateId;

    protected String templateParam;

}