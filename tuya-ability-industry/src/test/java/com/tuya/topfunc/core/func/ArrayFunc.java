package com.tuya.topfunc.core.func;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public interface ArrayFunc extends ObjectFunc {

    default <T> Stream<T> stream(T[] array) {
        return Arrays.stream(array);
    }

//see ObjectFunc#bool
/*    default <T> boolean isNullOrEmpty(T[] array) {
        return array == null || array.length == 0;
    }*/

    default <T> void eachWithIndex(T[] arr, BiConsumer<Integer, T> fun) {
        for (int i = 0; i < arr.length; i++) {
            fun.accept(i, arr[i]);
        }
    }
}
