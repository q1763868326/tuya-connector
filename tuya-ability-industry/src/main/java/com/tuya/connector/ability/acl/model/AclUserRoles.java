package com.tuya.connector.ability.acl.model;

import com.google.gson.annotations.SerializedName;



import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @description 用户 批量角色 授权 请求
 * @author benguan.zhou@tuya.com
 * @date 2021/05/24
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class AclUserRoles implements Serializable {
    protected static final long serialVersionUID = 1L;

    String uid;

    @SerializedName("roleCodeList")
    List<String> roleCodeList;

    /**
     * 隔离空间id
     */
    @SerializedName("spaceId")
    String spaceId;

}
