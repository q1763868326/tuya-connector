package com.tuya.connector.industry.ability.acl.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

/**
 * @author mickey
 * @date 2021年06月03日 14:54
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class AclPageParam implements Serializable {
    protected static final long serialVersionUID = 1L;
    /**
     * Integer	每页容量	是
     */
    private Integer pageSize ;
    /**
     * Integer	当前页码	是
     */
    private Integer pageNumber;

}
