package com.tuya.connector.industry.ability.acl.model;

import com.google.gson.annotations.SerializedName;



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
public class AclRolePermissions implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 角色code
     */
    @SerializedName("roleCode")
    String roleCode;

    /**
     * 权限标识
     */
    @SerializedName("permissionCodes")
    List<String> permissionCodes;

    /**
     * 隔离空间id
     */
    @SerializedName("spaceId")
    String spaceId;

}
