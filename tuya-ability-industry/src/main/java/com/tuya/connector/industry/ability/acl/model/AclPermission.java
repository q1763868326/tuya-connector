package com.tuya.connector.industry.ability.acl.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;
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
public class AclPermission implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 权限标识   SerializedName 这个注解别随便去掉，对方会收不到这个参数。至于其他参数为什么可以，谁知道呢
     */
    @SerializedName("permissionCode")
    String permissionCode;

    /**
     * 显示名称
     */
    String name;

    /**
     * 权限类型(api/menu/button/data)
     */
    Integer type;

    /**
     * 父级权限code
     */
    String parentCode;

    /**
     * 展示顺序
     */
    Integer order;

    /**
     * 备注
     */
    String remark;

    /**
     * 权限空间id
     * */
    String spaceId;
}
