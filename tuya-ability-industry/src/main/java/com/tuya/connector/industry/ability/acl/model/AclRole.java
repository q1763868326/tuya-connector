package com.tuya.connector.industry.ability.acl.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.List;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/24
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class AclRole implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 角色code
     */
    String roleCode;

    /**
     * 角色名字
     */
    String roleName;

    /**
     * 隔离空间id
     */
    String spaceId;

    /**
     * 备注
     */
    String remark;

    List<AclPermission> permissionList;

}
