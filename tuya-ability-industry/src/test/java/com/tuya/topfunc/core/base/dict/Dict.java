package com.tuya.topfunc.core.base.dict;

import com.tuya.topfunc.core.base.tuple.Tuple2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Dict<V> extends TreeMap<String,V> {

    public static Dict<String> of(Map<String,String> map){
        Dict<String> dict = new Dict<>();
        dict.putAll(map);
        return dict;
    }
    public static Dict<String> of(String content,char kvSeparator){
        Map<String,String> map = Arrays.stream(content.split("\n"))
                .map(it->it.trim())
                .filter(it->it.length()>0)
                //#开头的为注释
                .filter(it->!it.startsWith("#"))
                .map(it->{
                    int i = it.indexOf(kvSeparator);
                    if(i<0){
                        return null;
                    }else{
                        return new Tuple2<>(it.substring(0,i),it.substring(i));
                    }
                })
                .filter(it->it!=null)
                .collect(Collectors.toMap(it->it.getV1(),it->it.getV2()));
        return of(map);
    }

}
