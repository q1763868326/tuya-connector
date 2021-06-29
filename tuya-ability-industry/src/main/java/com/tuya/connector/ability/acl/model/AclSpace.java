package com.tuya.connector.ability.acl.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.List;

/**
 * @description
 * @author benguan.zhou@tuya.com
 * @date 2021/05/24
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class AclSpace implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 空间分组
     */
    String spaceGroup;

    /**
     * 空间隔离标识
     */
    String spaceCode;

    /**
     * 备注
     */
    String remark;

    /**
     * 鉴权扩展字段
     */
    Integer authentication;

    /**
     * 拥有者
     */
    List<String> ownerList;

}
