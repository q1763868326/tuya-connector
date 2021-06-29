package com.tuya.topfunc.core.util;

import lombok.SneakyThrows;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;

/**
 * copy from org.springframework.util.ReflectionUtils
 * spring5.3.8
 * spring的ReflectionUtils#findMethod有两个版本
 * 1 根据方法名匹配。
 * 2 根据方法名和参数类型精确匹配。
 * 如果我根据方法参数去匹配，在方法参数中有null值的情况，是没办法匹配出来的。
 * 因为我没有办法知道null对应的参数是作为什么类型的值传过来的。
 * 我们需要一个类似于groovy的metaClass#respondsTo的方法。
 * 所以，我加了一个根据实参匹配的方法。
 */
public abstract class Reflections extends ReflectionUtils {

    private static Pattern pattern = Pattern.compile("(?<!\\\\)\\.");
    private static final Method[] EMPTY_METHOD_ARRAY = new Method[0];

    private static final Map<Class<?>, Method[]> declaredMethodsCache;
    static{
        Field declaredMethodsCacheField = findField(ReflectionUtils.class,"declaredMethodsCache");
        makeAccessible(declaredMethodsCacheField);
        try {
            declaredMethodsCache = (Map<Class<?>, Method[]>) declaredMethodsCacheField.get(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 和spring版本的ReflectionUtils#findMethod不一样的是，hasSameParams方法的实现不一样。
     * spring的是类型精确匹配。我们使用不精确匹配的方式。
     * */
    @Nullable
    public static Method findMethodByArgs(Class<?> clazz, String name, Object... args) {
        Assert.notNull(clazz, "Class must not be null");
        Assert.notNull(name, "Method name must not be null");
        Class<?> searchType = clazz;
        Class<?>[] paramTypes = null;
        if(args != null){
            paramTypes = new Class[args.length];
            for(int i=0;i<args.length;i++){
                if(args[i] == null){
                    paramTypes[i] = null;
                }
                paramTypes[i] = args[i].getClass();
            }
        }

        while (searchType != null) {
            Method[] methods = (searchType.isInterface() ? searchType.getMethods() :
                    getDeclaredMethods(searchType, false));
            for (Method method : methods) {
                if (name.equals(method.getName()) && (paramTypes == null || hasSameParams(method, paramTypes))) {
                    return method;
                }
            }
            searchType = searchType.getSuperclass();
        }
        return null;
    }



    private static boolean hasSameParams(Method method, Class<?>[] paramTypes) {
        return typeMatches(paramTypes, method.getParameterTypes());
    }

    public static boolean typeMatches(Class[] actualParamTypes, Class[] virtualParamTypes) {
        if(actualParamTypes.length!=virtualParamTypes.length){
            return false;
        }
        int len = virtualParamTypes.length;
        for (int i=0; i<len; i++) {
            Class act = actualParamTypes[i];
            Class vir = virtualParamTypes[i];
            //实参为null，则当成Any类型
            if(act == null){
                continue;
            }
            //如果形参为原始类型，则要获取其包装类型
            if(vir.isPrimitive()){
                vir = Classs.getWrapperClass(vir);
            }
            //实参不为形参或其子类，则不匹配
            if(!vir.isAssignableFrom(act)){
                return false;
            }
        }
        return true;
    }

    private static Method[] getDeclaredMethods(Class<?> clazz, boolean defensive) {
        Assert.notNull(clazz, "Class must not be null");
        Method[] result = declaredMethodsCache.get(clazz);
        if (result == null) {
            try {
                Method[] declaredMethods = clazz.getDeclaredMethods();
                List<Method> defaultMethods = findConcreteMethodsOnInterfaces(clazz);
                if (defaultMethods != null) {
                    result = new Method[declaredMethods.length + defaultMethods.size()];
                    System.arraycopy(declaredMethods, 0, result, 0, declaredMethods.length);
                    int index = declaredMethods.length;
                    for (Method defaultMethod : defaultMethods) {
                        result[index] = defaultMethod;
                        index++;
                    }
                }
                else {
                    result = declaredMethods;
                }
                declaredMethodsCache.put(clazz, (result.length == 0 ? EMPTY_METHOD_ARRAY : result));
            }
            catch (Throwable ex) {
                throw new IllegalStateException("Failed to introspect Class [" + clazz.getName() +
                        "] from ClassLoader [" + clazz.getClassLoader() + "]", ex);
            }
        }
        return (result.length == 0 || !defensive) ? result : result.clone();
    }

    @Nullable
    private static List<Method> findConcreteMethodsOnInterfaces(Class<?> clazz) {
        List<Method> result = null;
        for (Class<?> ifc : clazz.getInterfaces()) {
            for (Method ifcMethod : ifc.getMethods()) {
                if (!Modifier.isAbstract(ifcMethod.getModifiers())) {
                    if (result == null) {
                        result = new ArrayList<>();
                    }
                    result.add(ifcMethod);
                }
            }
        }
        return result;
    }

    // a.b.c.d.0.my.e  =>  a,b,c,0,my,e
    public static <T> T forceGetFieldValue(Object target,String path,boolean autoUnwrapJdkProxy){
        return forceGetFieldValue(target,path,null,autoUnwrapJdkProxy);
    }
    public static <T> T forceGetFieldValue(Object target,String path){
        return forceGetFieldValue(target,path,null,false);
    }
    public static <T> void forceSetFieldValue(Object target,String path,T value,boolean autoUnwrapJdkProxy){
        forceGetFieldValue(target,path,it->value,autoUnwrapJdkProxy);
    }
    public static <T> void forceSetFieldValue(Object target,String path,T value){
        forceGetFieldValue(target,path,it->value,false);
    }
    private static <T> T forceGetFieldValue(Object target, String path, Function<T,T> function, boolean autoUnwrapJdkProxy){
        Object parent = null;
        Object value = target;
        List<String> fieldNames = Arrays.asList(pattern.split(path));
        Field field = null;
        int index = 0;
        String key = null;
        Assert.notEmpty(fieldNames,"path is empty!");
        for(String fieldName: fieldNames){
            parent = value;
            fieldName = fieldName.replaceAll("\\\\","");
            if(autoUnwrapJdkProxy){
                parent = unwrapJdkProxy(parent);
            }
            if(parent instanceof List){
                List list = (List) parent;
                index = Integer.parseInt(fieldName);
                value = list.get(index);
            }else if(parent instanceof Map){
                Map map = (Map) value;
                key = fieldName;
                value = map.get(key);
            }else{
                field = ReflectionUtils.findField(parent.getClass(),fieldName);
                ReflectionUtils.makeAccessible(field);
                if(Modifier.isStatic(field.getModifiers())){
                    parent = null;
                }
                value = ReflectionUtils.getField(field,parent);
            }
        }
        if(autoUnwrapJdkProxy) {
            value = unwrapJdkProxy(value);
        }
        if(function!=null){
            T newValue = function.apply((T) value);
            if(parent instanceof List){
                List list = (List) parent;
                list.set(index,newValue);
            }else if(parent instanceof Map){
                Map map = (Map) value;
                map.put(key,newValue);
            }else{
                ReflectionUtils.setField(field,parent,newValue);
            }
        }
        return (T) value;
    }
    @SneakyThrows
    private static <T> T unwrapJdkProxy(T target){
        Object obj = target;
        while(obj.getClass().getName().startsWith("com.sun.proxy.$Proxy")){
            Field f = obj.getClass().getDeclaredField("h");
            f.setAccessible(true);
            obj = f.get(obj);
            f = obj.getClass().getDeclaredField("target");
            f.setAccessible(true);
            obj = f.get(obj);
        }
        return (T) obj;
    }

}
