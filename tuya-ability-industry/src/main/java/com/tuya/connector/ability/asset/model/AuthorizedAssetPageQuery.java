package com.tuya.connector.ability.asset.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Description: 已经授权的资产查询请求模型
 * @auther: Medivh.chen@tuya.com
 * @date: 2021/04/20
 **/
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AuthorizedAssetPageQuery extends AssetPageQuery implements Serializable {
    protected static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private String uid;
}
