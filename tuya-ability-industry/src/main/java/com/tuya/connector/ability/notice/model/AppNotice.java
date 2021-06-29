package com.tuya.connector.ability.notice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AppNotice extends AbsNotice implements Serializable {
    protected static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    private String uid;
    /**
     * 涂鸦体系的业务类型
     */
    private String bizType;

}
