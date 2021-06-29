package com.tuya.topfunc.core.func;


import com.tuya.topfunc.core.util.Exceptions;
import com.tuya.topfunc.core.util.Functions;

import java.util.function.Consumer;

public interface TestFunc extends IOFunc, ObjectFunc {
    default void expectThrows(Class<? extends Throwable> exceptionType, Functions.Producer producer){
        try {
            producer.produce();
            throw new Exceptions.ShouldNotTouchException();
        }catch (Exception e){
            if(!exceptionType.isAssignableFrom(e.getClass())){
                throw e;
            }else{
                println(format("got expected exception %s",e.getClass().getName()));
            }
        }
    }
    default <E extends Throwable> void expectThrows(Consumer<E> exceptionConsumer, Functions.Producer producer){
        try {
            producer.produce();
            exceptionConsumer.accept(null);
        }catch (Exception e){
            exceptionConsumer.accept((E) e);
        }
    }
}
