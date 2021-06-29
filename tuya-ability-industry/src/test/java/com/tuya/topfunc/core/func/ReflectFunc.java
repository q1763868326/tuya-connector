package com.tuya.topfunc.core.func;

import com.tuya.topfunc.core.util.Reflections;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface ReflectFunc extends ObjectFunc {

    //reflect
    default void doWithFields(Class<?> clazz, Consumer<Field> consumer, Predicate<Field> fieldPredicate) {
        ReflectionUtils.doWithFields(clazz, f -> consumer.accept(f), f -> fieldPredicate.test(f));
    }

    /***
     * spring的查找方法，ReflectionUtils#findMethod需要精确匹配参数类型。
     * 如果我根据方法参数去匹配，在方法参数中有null值的情况，是没办法匹配出来的。
     * 我们需要一个类似于groovy的metaClass#respondsTo的方法。
     */
    default <T> T invokeMethod(Class<?> clazz, String method, Object target, Object... args) {
        Method m = Reflections.findMethodByArgs(clazz, method, args);
        ReflectionUtils.makeAccessible(m);
        return (T) ReflectionUtils.invokeMethod(m, target, args);
    }

    default <T> T invokeMethod(Method method, Object target, Object... args) {
        ReflectionUtils.makeAccessible(method);
        return (T) ReflectionUtils.invokeMethod(method, target, args);
    }

    /**
     * 属性导航，
     * 比如 a.b.c.d.0.my.e
     * SkipJdkProxy,如果中间有jdk代理对象，则会自动对其unwrap
     * map的key，如果包含字符".",需要在path中转义为"\\."
     */
    default <T> T forceGet(Object obj, String fieldPath) {
        return Reflections.forceGetFieldValue(obj, fieldPath);
    }
    default <T> T forceGet(Object obj, String fieldPath, boolean autoUnwrapJdkProxy) {
        return Reflections.forceGetFieldValue(obj, fieldPath,autoUnwrapJdkProxy);
    }

    default void forceSet(Object obj, String fieldPath, Object value) {
        Reflections.forceSetFieldValue(obj, fieldPath, value);
    }

    default void forceSet(Object obj, String fieldPath, Object value, boolean autoUnwrapJdkProxy) {
        Reflections.forceSetFieldValue(obj, fieldPath, value,autoUnwrapJdkProxy);
    }

}
