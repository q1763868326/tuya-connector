package com.tuya.connector.ability.asset.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @Description 资产授权请求数据模型
 * @author Medivh.chen@tuya.com
 * @date 2021/04/20
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AssetAuthorize implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 资产ID
     */
    private String uid;
    /**
     * 资产ID
     */
    private String assetId;
    /**
     * 是否给子节点授权,默认是false
     */
    private boolean authorizedChildren;
}
