package com.itheima.demo8;

import java.util.*;

/**
 * @author wz
 * @create 2019-02-16 9:22
 */
/*
八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）
出现的次数。例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
* */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"asyudfkaydglausdg","asghdfkafsdzz","adshfkauydsf","dasytasdtpa8we");
        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int index=0;
                if (!map.containsKey(c)){
                    map.put(c,1);
                }else {
                    map.put(c,map.get(c)+1);
                }
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }

    }
}
