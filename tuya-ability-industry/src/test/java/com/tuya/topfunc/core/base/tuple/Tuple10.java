package com.tuya.topfunc.core.base.tuple;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Tuple10<V1,V2,V3,V4,V5,V6,V7,V8,V9,V10> implements Serializable {

    static final long serialVersionUID = 1L;

    private V1 v1;
    private V2 v2;
    private V3 v3;
    private V4 v4;
    private V5 v5;
    private V6 v6;
    private V7 v7;
    private V8 v8;
    private V9 v9;
    private V10 v10;
}
