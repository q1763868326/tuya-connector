package com.tuya.topfunc.core.func;

import com.google.common.base.Defaults;
import com.tuya.topfunc.core.base.dict.Dict;
import com.tuya.topfunc.core.base.tuple.*;
import lombok.SneakyThrows;
import org.springframework.util.ClassUtils;
import org.springframework.util.SerializationUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface ObjectFunc {
    /**
     * 当你的方法需要实现，但是你现在没空实现它的时候，你需要它
     */
    default <T> T todo() {
        throw new RuntimeException("todo");
    }

    /**
     * 多少次写下面这样的代码
     * if(!(obj instanceof Collection)){
     *
     * }
     * 现在这样写
     * if(!isInstanceOf(obj,Collection.class)){
     *
     * }
     * */
    default boolean isInstanceOf(Object o, Class clazz){
        return o!=null && clazz.isAssignableFrom(o.getClass());
    }
    /**
     * 第一个参数为空时，返回第二个参数
     */
    default <T> T orElse(T t, T elseValue) {
        return bool(t)?t:elseValue;
        //return Optional.ofNullable(t).orElse(elseValue);
        //return t != null ? t : elseValue;
    }

    default <T> T orElseGet(T t, Supplier<T> supplier) {
        if(bool(t)){
            return t;
        }
        return supplier.get();
        //return Optional.ofNullable(t).orElseGet(supplier);
    }

    @SneakyThrows
    default <T, X extends Throwable> T orElseThrow(T t,
                                                   Supplier<? extends X> supplier) {
        if(bool(t)){
            return t;
        }
        throw supplier.get();
        //return Optional.ofNullable(t).orElseThrow(supplier);
    }

    /**
     * java泛型不支持协变和逆变
     * 比如
     * List<Cat> cats = ...
     * List<Animal> animals = cats//编译不通过
     */
    default <T> T cast(Object o) {
        return (T) o;
    }
    default <T> T cast(Object o,Class<T> clazz) {
        return (T) o;
    }

    /**
     * 有时候需要多个返回值
     */
    default <V1, V2> Tuple2<V1, V2> tuple(V1 v1, V2 v2) {
        return new Tuple2<>(v1, v2);
    }

    default <V1, V2, V3> Tuple3<V1, V2, V3> tuple(V1 v1, V2 v2, V3 v3) {
        return new Tuple3<>(v1, v2, v3);
    }

    default <V1, V2, V3, V4> Tuple4<V1, V2, V3, V4> tuple(V1 v1, V2 v2, V3 v3, V4 v4) {
        return new Tuple4<>(v1, v2, v3, v4);
    }

    default <V1, V2, V3, V4, V5> Tuple5<V1, V2, V3, V4, V5> tuple(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5) {
        return new Tuple5<>(v1, v2, v3, v4, v5);
    }

    default <V1, V2, V3, V4, V5, V6> Tuple6<V1, V2, V3, V4, V5, V6> tuple(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, V6 v6) {
        return new Tuple6<>(v1, v2, v3, v4, v5, v6);
    }

    default <V1, V2, V3, V4, V5, V6, V7> Tuple7<V1, V2, V3, V4, V5, V6, V7> tuple(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5, V6 v6, V7 v7) {
        return new Tuple7<>(v1, v2, v3, v4, v5, v6, v7);
    }

    default <V1, V2, V3, V4, V5, V6, V7, V8> Tuple8<V1, V2, V3, V4, V5, V6, V7, V8> tuple(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5,
                                                                                          V6 v6, V7 v7, V8 v8) {
        return new Tuple8<>(v1, v2, v3, v4, v5, v6, v7, v8);
    }

    default <V1, V2, V3, V4, V5, V6, V7, V8, V9> Tuple9<V1, V2, V3, V4, V5, V6, V7, V8, V9> tuple(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5,
                                                                                                  V6 v6, V7 v7, V8 v8, V9 v9) {
        return new Tuple9<>(v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }

    default <V1, V2, V3, V4, V5, V6, V7, V8, V9, V10> Tuple10<V1, V2, V3, V4, V5, V6, V7, V8, V9, V10> tuple(V1 v1, V2 v2, V3 v3, V4 v4, V5 v5,
                                                                                                             V6 v6, V7 v7, V8 v8, V9 v9, V10 v10) {
        return new Tuple10<>(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
    }
    //比如读取properties配置，比如解析http headers
    default Dict<String> dict(String content, char separator){
        return Dict.of(content,separator);
    }
    default Dict<String> dict(String content){
        return Dict.of(content,'=');
    }

    /**
     * 转换为boolean值
     * */
    default boolean bool(Object o) {
        if(o == null){
            return false;
        }
        if(isInstanceOf(o,CharSequence.class)){
            return StringUtils.hasText(o.toString());
        }
        if(isInstanceOf(o,Optional.class)){
            return bool(cast(o,Optional.class).get());
        }
        if(isArray(o)){
            return Array.getLength(o)>0;
        }
        if(isInstanceOf(o,Collection.class)){
            return !cast(o,Collection.class).isEmpty();
        }
        if(isInstanceOf(o,Map.class)){
            return !cast(o,Map.class).isEmpty();
        }
        if(ClassUtils.isPrimitiveOrWrapper(o.getClass())){
            return !Objects.equals(o, Defaults.defaultValue(o.getClass()));
        }
        return true;
    }

    default boolean isArray(Object o) {
        return o == null || o.getClass().isArray();
    }

    default <T> T copy(T obj) {
        byte[] bytes = SerializationUtils.serialize(obj);
        return (T) SerializationUtils.deserialize(bytes);
    }

    /**
     * 类似kotlin的also
     * */
    default <T, R> R also(T obj, Function<T, R> f) {
        return f.apply(obj);
    }
    /**
     * 类似kotlin的let
     * */
    default <T> T let(T obj, Consumer<T> f) {
        f.accept(obj);
        return obj;
    }

}
