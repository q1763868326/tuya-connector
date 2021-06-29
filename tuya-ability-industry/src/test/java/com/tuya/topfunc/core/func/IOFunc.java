package com.tuya.topfunc.core.func;

import com.tuya.topfunc.core.util.IOs;
import lombok.SneakyThrows;

public interface IOFunc extends ObjectFunc, TextFunc {
    @SneakyThrows
    default String readLine(){
        return IOs.stdReader().readLine();
    }
    default void println(Object obj) {
        System.out.println(format("%s", obj));
    }

    default void printf(String template, Object... args) {
        System.out.println(format(template, args));
    }

}
