package com.tuya.connector.ability.asset.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Description  TODO
 *
 * @author Chyern
 * @date 2021/3/27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssetAdd implements Serializable {

    private static final long serialVersionUID = -4413618452512443438L;
    private String name;
    //private String metaId;
    private String parentAssetId;
}
