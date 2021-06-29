package com.tuya.connector.industry.ability.media.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.List;

/**
 * @description
 * @author benguan.zhou@tuya.com
 * @date 2021/05/24
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class P2pConfig implements Serializable {
    protected static final long serialVersionUID = 1L;

    /**
     * ICE信息
     */
    List<Ice> ices;

}
