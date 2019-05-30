package com.itheima.demo1;

import java.util.HashMap;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-16 9:22
 */
public class Demo {
//    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<>();
//        System.out.println(hashMap.put("1", "ygyh"));
//        System.out.println(hashMap.put("2", "sdad"));
////        System.out.println(hashMap.put("2", "sdad1"));
////        System.out.println(hashMap.remove("2"));
////        System.out.println(hashMap.get("1"));
//
////        System.out.println(hashMap);
////        获取键的集合
////        Set<String> keySet = hashMap.keySet();
////        for (String s : keySet) {
////            System.out.println(hashMap.get(s));
////        }
//        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
//        for (Map.Entry<String, String> entry : entrySet) {
//            System.out.println(entry.getValue());
//        }
////        System.out.println(strings);
//    }
public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();


    map.put(null, 0);


    Set<String> keySet = map.keySet();
    for (String key : keySet) {
        System.out.println(key+":"+map.get(key));
    }
}
}
