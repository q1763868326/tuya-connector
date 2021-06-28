package com.tuya.connector.ability.asset.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/28
 */
@Data
public abstract class AssetPageQuery implements Serializable {
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
