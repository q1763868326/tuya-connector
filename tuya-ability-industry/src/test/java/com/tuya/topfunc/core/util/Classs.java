package com.tuya.topfunc.core.util;

import java.util.HashMap;
import java.util.Map;

public abstract class Classs {
    public static final Map<Class,Class> primitiveToWrapperMap = new HashMap<>();
    static {
        primitiveToWrapperMap.put(boolean.class,Boolean.class);
        primitiveToWrapperMap.put(byte.class,Byte.class);
        primitiveToWrapperMap.put(short.class,Short.class);
        primitiveToWrapperMap.put(int.class,Integer.class);
        primitiveToWrapperMap.put(long.class,Long.class);
        primitiveToWrapperMap.put(float.class,Float.class);
        primitiveToWrapperMap.put(double.class,Double.class);
        primitiveToWrapperMap.put(char.class,Character.class);
    }
    public static Class getWrapperClass(Class primitiveClass){
        return primitiveToWrapperMap.get(primitiveClass);
    }
}
