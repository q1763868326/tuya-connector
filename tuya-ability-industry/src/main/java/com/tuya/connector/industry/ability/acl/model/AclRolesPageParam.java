package com.tuya.connector.industry.ability.acl.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/01
 */
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AclRolesPageParam extends AclPageParam implements Serializable {
    protected static final long serialVersionUID = 1L;
    /**
    角色code集合	否
     */
    List<String> roleCodes;
    /**String	角色code	否*/
    String roleCode;
    /**	String	角色名称	否*/
    String roleName;

    Boolean gmtModifiedAsc;

}
