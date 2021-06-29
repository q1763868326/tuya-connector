package com.tuya.connector.ability.asset.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @author Chyern
 * @date 2021/3/9
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class Asset implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 资产Id
     */
    private String assetId;

    /**
     * 资产名
     */
    private String assetName;

    /**
     * 资产全名
     */
    private String assetFullName;

    /**
     * 父资产id
     */
    private String parentAssetId;

    /**
     * 设备ID
     */
    private String deviceId;
    /**
     * 层级号
     */
    private Integer level;
}
