package com.tuya.connector.ability.asset.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
/**
 * @description 本来这个类可以不要的，但是添加的时候，资产名称的字段名为name，
 * 而Asset类里面的资产名称字段名为assetName
 * @author Chyern
 * @date 2021/3/27
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class AssetAdd implements Serializable {
    protected static final long serialVersionUID = 1L;
    private String name;
    //private String metaId;
    private String parentAssetId;
}
