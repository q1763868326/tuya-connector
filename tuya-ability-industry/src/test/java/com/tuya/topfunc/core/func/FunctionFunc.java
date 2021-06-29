package com.tuya.topfunc.core.func;

import com.google.common.base.Suppliers;
import lombok.SneakyThrows;
import com.tuya.topfunc.core.util.Functions;

import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface FunctionFunc extends ObjectFunc {

    /**
     * 可以实现lazyinit字段。
     */
    default <T> Supplier<T> memoize(Supplier<T> supplier) {
        return Suppliers.memoize(() -> supplier.get());
    }

    /**
     * 比如某些openapi需要token，但是token有超时机制
     */
    default <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long duration, TimeUnit unit) {
        return Suppliers.memoizeWithExpiration(() -> supplier.get(), duration, unit);
    }

    default <T, R> Function<T, R> sneakyFunction(Functions.Function0<T, R> f) {
        return new Function<T, R>() {
            @Override
            @SneakyThrows
            public R apply(T t) {
                return f.apply(t);
            }
        };
    }

    default <T> Consumer<T> sneakyConsumer(Functions.Consumer0<T> c) {
        return new Consumer<T>() {
            @SneakyThrows
            @Override
            public void accept(T t) {
                c.accept(t);
            }
        };
    }

    default <T> Supplier<T> sneakySupplier(Functions.Supplier0<T> s) {
        return new Supplier<T>() {
            @SneakyThrows
            @Override
            public T get() {
                return s.get();
            }
        };
    }

    default <T> Predicate<T> sneakyPredicate(Functions.Predicate0<T> p) {
        return new Predicate<T>() {
            @SneakyThrows
            @Override
            public boolean test(T t) {
                return p.test(t);
            }
        };
    }

    default <T, U, R> BiFunction<T, U, R> sneakyBiFunction(Functions.BiFunction0<T, U, R> f) {
        return new BiFunction<T, U, R>() {
            @Override
            @SneakyThrows
            public R apply(T t, U u) {
                return f.apply(t, u);
            }
        };
    }

    default <T, U> BiConsumer<T, U> sneakyBiConsumer(Functions.BiConsumer0<T, U> c) {
        return new BiConsumer<T, U>() {
            @SneakyThrows
            @Override
            public void accept(T t, U u) {
                c.accept(t, u);
            }
        };
    }

    default <T, U> BiPredicate<T, U> sneakyBiPredicate(Functions.BiPredicate0<T, U> p) {
        return new BiPredicate<T, U>() {
            @SneakyThrows
            @Override
            public boolean test(T t, U u) {
                return p.test(t, u);
            }
        };
    }

}
