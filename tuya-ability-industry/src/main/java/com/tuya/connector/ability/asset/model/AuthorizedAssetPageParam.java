package com.tuya.connector.ability.asset.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @description 已经授权的资产查询请求模型
 * @auther Medivh.chen@tuya.com
 * @date 2021/04/20
 **/
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AuthorizedAssetPageParam extends AssetPageParam implements Serializable {
    protected static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private String uid;
}
