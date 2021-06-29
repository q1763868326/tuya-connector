package com.tuya.connector.industry.ability.asset.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

@Data
@NoArgsConstructor
@SuperBuilder
public class UserAsset implements Serializable {
    protected static final long serialVersionUID = 1L;

    private String uid;

    private String assetId;

    private Boolean authorizedChildren;

}
