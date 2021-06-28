package com.tuya.connector.ability.acl.model;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/05/24
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AclUserRole implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 角色code
     */
    @SerializedName("roleCode")
    String roleCode;


    String uid;

    /**
     * 隔离空间id
     */
    @SerializedName("spaceId")
    String spaceId;

}
