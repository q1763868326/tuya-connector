package com.tuya.connector.ability.media.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * @description:
 * @author: benguan.zhou@tuya.com
 * @date: 2021/05/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Builder
public class Ice implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * 服务器地址
     */
    String urls;

    /**
     * 用户名
     */
    String username;

    /**
     * 密码
     */
    String credential;

    /**
     * 有效时长
     */
    Integer ttl;

}
