package com.tuya.topfunc.core.func;

import com.google.common.collect.Sets;
import org.apache.commons.lang3.mutable.MutableInt;
import com.tuya.topfunc.core.base.tuple.Tuple2;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface CollectionFunc extends ObjectFunc {

    default <T> List<T> listOf(T... items) {
        List<T> list = new LinkedList<>();
        if (items == null) {
            return list;
        }
        for (T item : items) {
            list.add(item);
        }
        return list;
    }
    default <T> List<T> listOf(Iterator<T> iter) {
        List<T> list = new LinkedList<>();
        while(iter.hasNext()){
            list.add(iter.next());
        }
        return list;
    }
    default <T> List<T> listOf(Iterable<T> iterable) {
        return listOf(iterable.iterator());
    }

    default <T> Set<T> setOf(T... items) {
        Set<T> set = new HashSet<>();
        if (items == null) {
            return set;
        }
        for (T item : items) {
            set.add(item);
        }
        return set;
    }
    default <T> Set<T> setOf(Iterator<T> iter) {
        Set<T> set = new HashSet<>();
        while(iter.hasNext()){
            set.add(iter.next());
        }
        return set;
    }
    default <T> Set<T> setOf(Iterable<T> iterable) {
        return setOf(iterable.iterator());
    }

    default <K, V> Map<K, V> mapOf() {
        return new HashMap<>();
    }

    default <K, V> Map<K, V> mapOf(K k, V v) {
        Map<K, V> map = new HashMap<>();
        map.put(k, v);
        return map;
    }

    default <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        return map;
    }

    default <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        return map;
    }

    default <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        return map;
    }

    default <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        return map;
    }

    default <K,V> Map<K,V> mapOf(Map<K,V> origMap){
        Map<K,V> map = new HashMap<>();
        map.putAll(origMap);
        return map;
    }

    default <K, V> Map<K, V> zip(Iterator<K> keys, Iterator<V> values) {
        Map<K, V> map = new LinkedHashMap<>();
        while (keys.hasNext()) {
            if (values.hasNext()) {
                map.put(keys.next(), values.next());
            } else {
                map.put(keys.next(), null);
            }
        }
        return map;
    }

    default <K, V> Tuple2<List<K>, List<V>> unzip(Map<K, V> map) {
        List<K> keys = listOf();
        List<V> values = listOf();
        map.forEach((k, v) -> {
            keys.add(k);
            values.add(v);
        });
        return new Tuple2<>(keys, values);
    }

    /*default <T> T head(List<T> list) {
        Iterator<T> iter = list.iterator();
        if (iter.hasNext()) {
            return iter.next();
        } else {
            throw new IllegalArgumentException("list is empty!");
        }
    }

    default <T> List<T> tail(List<T> list) {
        return list.subList(1, list.size());
    }

    default <T> List<T> init(List<T> list) {
        return list.subList(0, list.size() - 1);
    }

    default <T> T last(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("list is empty!");
        }
        return list.get(list.size() - 1);
    }
*/
   /* default <T> boolean isNullOrEmpty(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    default <K, V> boolean isNullOrEmpty(Map<K, V> map) {
        return map == null || map.isEmpty();
    }
*/
    /**
     * 和list.addAll不同的是，concat是纯函数
     * */
    default <T> List<T> concat(List<T> list1, List<T> list2, List<T>... otherLists) {
        List<T> ret = new LinkedList<>();
        ret.addAll(list1);
        ret.addAll(list2);
        if(otherLists != null){
            for (List<T> list: otherLists){
                ret.addAll(list);
            }
        }
        return ret;
    }
    /**
     * 和Collections.reverse()不同的是，reverse是纯函数
     * */
    default <T> List<T> reverse(List<T> list) {
        LinkedList<T> linkedList = new LinkedList<>();
        for (T t : list) {
            linkedList.addFirst(t);
        }
        return linkedList;
    }
    /**
     * 反转map的key和value
     */
    default <K,V> Map<V,K> inverse(Map<K,V> map){
        Map<V,K> newMap = new HashMap<>();
        map.forEach((k,v)->newMap.put(v,k));
        return newMap;
    }
    /**
     * 切片
     * 和list.subList不同的是，slice支持负数索引
     * */
    default <T> List<T> slice(List<T> list,int start,int end){
        int size = list.size();
        start = (start+size)%size;
        end = (end+size)%size;
        return list.subList(start,end);
    }
    /**差集*/
    default <T> Set<T> difference(Iterable<T> iter1, Iterable<T> iter2) {
        Set<T> set1;
        if(iter1 instanceof Set){
            set1 = cast(iter1);
        }else{
            set1 = setOf(iter1);
        }
        Set<T> set2;
        if(iter2 instanceof Set){
            set2 = cast(iter2);
        }else{
            set2 = setOf(iter2);
        }
        return Sets.difference(set1, set2);
    }
    /**
     * 交集
     * */
    default <T> Set<T> intersect(Iterable<T> iter1, Iterable<T> iter2) {
        Set<T> set1;
        if(iter1 instanceof Set){
            set1 = cast(iter1);
        }else{
            set1 = setOf(iter1);
        }
        Set<T> set2;
        if(iter2 instanceof Set){
            set2 = cast(iter2);
        }else{
            set2 = setOf(iter2);
        }
        return Sets.intersection(set1, set2);
    }
    /**
     * 并集
     * */
    default <T> Set<T> union(Iterable<T> iter1, Iterable<T> iter2) {
        Set<T> set1;
        if(iter1 instanceof Set){
            set1 = cast(iter1);
        }else{
            set1 = setOf(iter1);
        }
        Set<T> set2;
        if(iter2 instanceof Set){
            set2 = cast(iter2);
        }else{
            set2 = setOf(iter2);
        }
        return Sets.union(set1, set2);
    }

    default <T> void eachWithIndex(Iterable<T> iterable, BiConsumer<Integer, T> fun) {
        Iterator<T> iter = iterable.iterator();
        int i = 0;
        while (iter.hasNext()) {
            fun.accept(i++, iter.next());
        }
    }

    default Stream<Integer> range(int start, int end) {
        Assert.isTrue(end > start, "end must be equals or bigger than start");
        MutableInt mutableInt = new MutableInt();
        mutableInt.setValue(start);
        Supplier<Integer> supplier = () -> mutableInt.getAndAdd(1);
        return Stream.generate(supplier).limit(end - start);
    }

    default Stream<Integer> rangeTo(int start, int end) {
        return range(start, end + 1);
    }

    default Stream<Character> range(char start, char end) {
        Assert.isTrue(end > start, "end must be equals or bigger than start");
        MutableInt mutableInt = new MutableInt();
        mutableInt.setValue(start);
        Supplier<Character> supplier = () -> (char) mutableInt.getAndAdd(1);
        return Stream.generate(supplier).limit(end - start);
    }

    default Stream<Character> rangeTo(char start, char end) {
        return range(start, (char) (end + 1));
    }

    default <K, V> Stream<Map.Entry<K, V>> stream(Map<K, V> map) {
        return map.entrySet().stream();
    }

}
