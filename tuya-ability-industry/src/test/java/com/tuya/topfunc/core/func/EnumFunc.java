package com.tuya.topfunc.core.func;

import java.util.LinkedHashMap;
import java.util.Map;

public interface EnumFunc extends ObjectFunc {

    default <E extends Enum<E>> Map<String,E> enumMap(Class<E> enumClass) {
        final Map<String, E> map = new LinkedHashMap<>();
        for (final E e: enumClass.getEnumConstants()) {
            map.put(e.name(), e);
        }
        return map;
    }

}
