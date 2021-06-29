package com.tuya.connector.industry.ability.acl.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.Collection;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/24
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class AclPermissions implements Serializable {
    protected static final long serialVersionUID = 1L;

    Collection<AclPermission> permissionList;
}
