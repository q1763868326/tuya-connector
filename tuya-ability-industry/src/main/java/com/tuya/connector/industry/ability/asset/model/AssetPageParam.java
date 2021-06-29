package com.tuya.connector.industry.ability.asset.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
@Data
@NoArgsConstructor
@SuperBuilder
public abstract class AssetPageParam implements Serializable {
    protected static final long serialVersionUID = 1L;
    /**
     * 页码
     */
    private int pageNo;
    /**
     * 每页大小
     */
    private int pageSize;
}
