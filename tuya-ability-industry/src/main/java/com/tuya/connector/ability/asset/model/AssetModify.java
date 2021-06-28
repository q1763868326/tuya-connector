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
 * @date 2021/3/15
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssetModify implements Serializable {

    private static final long serialVersionUID = 4046817704993815783L;
    private String name;
    //private String metaId;

}
