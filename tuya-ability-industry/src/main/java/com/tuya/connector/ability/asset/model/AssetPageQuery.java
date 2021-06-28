package com.tuya.connector.ability.asset.model;

import lombok.Data;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
@Data
public abstract class AssetPageQuery {
    /**
     * 页码
     */
    private int pageNo;
    /**
     * 每页大小
     */
    private int pageSize;
}
