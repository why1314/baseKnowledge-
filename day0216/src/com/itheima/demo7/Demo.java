package com.itheima.demo7;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wz
 * @create 2019-02-16 9:22
 */
/*
七、有2个数组，
第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，
第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
* */
public class Demo {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("黑龙江省","哈尔滨");
        hashMap.put("浙江省","杭州");
        hashMap.put("江西省","南昌");
        hashMap.put("广东省","广州");
        hashMap.put("福建省","福州");

        System.out.println(hashMap);
    }
}
