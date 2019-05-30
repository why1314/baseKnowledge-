package com.itheima.demo12;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {
    public static <T> void doJob(T t, Consumer<T> consumer) {
        consumer.accept(t);
    }

    public static <T> void doJob(T t, Consumer<T> consumer1, Consumer<T> consumer2) {
        consumer1.andThen(consumer2).accept(t);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //key:姓名 value:成绩
        map.put("岑小村", 59);
        map.put("谷天洛", 82);
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);


        doJob(map, (map1) -> {
            Integer score = map1.get("谷天洛");
            System.out.println(score);
        });

        doJob(map, (map1) -> {
            Set<String> set = map1.keySet();
            ArrayList<String> list = new ArrayList<>(set);
            Integer max = map1.get(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                Integer num = map1.get(list.get(i));
                if (max < num) {
                    max = num;
                }
            }
            System.out.println(max);
        });

        doJob(map, (map1) -> {
            Set<String> keySet = map1.keySet();
            ArrayList<String> list = new ArrayList<>(keySet);
            for (String s : keySet) {
                Integer num = map1.get(s);
                if (num >= 60) {
                    System.out.println(s + "====" + num);
                }
            }


        }, (map2) -> {
            Set<String> keySet = map2.keySet();
            for (String s : keySet) {
                Integer num = map2.get(s);
                if (num >= 70) {
                    System.out.println(s + "====" + num);
                }
            }

        });
    }
}