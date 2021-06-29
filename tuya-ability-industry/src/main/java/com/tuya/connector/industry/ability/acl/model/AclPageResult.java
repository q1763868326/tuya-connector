package com.tuya.connector.industry.ability.acl.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.List;

/**
 * @author benguan.zhou@tuya.com
 * @description
 * @date 2021/06/01
 */
@Data
@NoArgsConstructor
@SuperBuilder
public class AclPageResult<T> implements Serializable {
    protected static final long serialVersionUID = 1L;
    Integer pageNumber;
    Integer pageSize;
    Integer totalCount;
    Integer totalPages;
    List<T> results;
}
