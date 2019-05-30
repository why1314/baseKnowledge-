package com.itheima.demo4;

import java.util.*;

/**
 * @author wz
 * @create 2019-02-16 9:22
 */
/*
请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作。
* */
public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.put(1, "ww"));
        System.out.println(map.put(2, "sahgd"));
        System.out.println(map.put(3, "asdgh"));
        System.out.println(map.put(4, "asdhalk"));
        System.out.println(map.put(1, "xx"));
//        System.out.println(map.remove(1));
//        System.out.println("===================");
//        Set<Integer> set = map.keySet();
//        for (Integer i : set) {
//            System.out.println(map.get(i));
//        }

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
