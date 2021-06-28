package com.tuya.connector.ability.acl.model;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/24
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
public class AclUserPageQuery extends AclPageQuery implements Serializable {
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
