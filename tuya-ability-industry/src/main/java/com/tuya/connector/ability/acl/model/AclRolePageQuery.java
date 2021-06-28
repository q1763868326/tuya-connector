package com.tuya.connector.ability.acl.model;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
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
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class AclRolePageQuery extends AclPageQuery implements Serializable {
    protected static final long serialVersionUID = 1L;
    /**
    角色code集合	否
     */
    @SerializedName("roleCodes")
    List<String> roleCodes;
    /**String	角色code	否*/
    @SerializedName("roleCode")
    String roleCode;
    /**	String	角色名称	否*/
    @SerializedName("roleName")
    String roleName;

    @SerializedName("gmtModifiedAsc")
    Boolean gmtModifiedAsc;

}
