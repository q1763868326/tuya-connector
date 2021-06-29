package com.tuya.connector.ability.asset.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @Description 已经授权的资产
 * @author Medivh.chen@tuya.com
 * @date 2021/04/20
 **/
@Data
@NoArgsConstructor
@SuperBuilder
public class AuthorizedAsset implements Serializable {
    protected static final long serialVersionUID = 1L;
    /**
     * 资产ID
     */
    private String assetId;

    /**
     * 父资产ID
     */
    private String parentAssetId;
    /**
     * 资产名称
     */
    private String assetName;

    /**
     * 层级号
     */
    private Integer level;


}
