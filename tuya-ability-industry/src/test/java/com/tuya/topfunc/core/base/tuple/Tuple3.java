package com.tuya.topfunc.core.base.tuple;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Tuple3<V1,V2,V3> implements Serializable {

    static final long serialVersionUID = 1L;

    private V1 v1;
    private V2 v2;
    private V3 v3;
}
