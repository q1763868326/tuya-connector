package com.tuya.connector.industry.ability.acl.model;

import com.google.gson.annotations.SerializedName;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/24
 */
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AclUsersPageParam extends AclPageParam implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 角色名
     */
    @SerializedName("roleName")
    String roleName;

    /**
     * 外部用户名
     */
    String username;

    /**
     * 角色code
     */
    @SerializedName("roleCode")
    String roleCode;


    @SerializedName("gmtModifiedAsc")
    Boolean gmtModifiedAsc;

}
