package com.itheima.demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-16 9:22
 */
/*
重复字符的个数
* */
public class Demo {
    public static void main(String[] args) {
        String str="hsdgkajdshglajsdhglasjfdhalksdjfhasdlfjhasd";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer value = map.get(c);
            if (value==null){
                 map.put(c,1);
            }else {
                map.put(c,++value);
            }
        }

        Set<Character> set = map.keySet();
        for (Character c : set) {
            System.out.println(c+"   "+map.get(c)+"次");
        }

    }
}
