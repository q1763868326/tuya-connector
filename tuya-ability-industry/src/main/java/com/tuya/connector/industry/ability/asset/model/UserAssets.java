package com.tuya.connector.industry.ability.asset.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * 用户资产关联
 * */
@Data
@NoArgsConstructor
@SuperBuilder
public class UserAssets implements Serializable {
    protected static final long serialVersionUID = 1L;

    private String uid;

    private String assetIds;

    private Boolean authorizedChildren;

}
