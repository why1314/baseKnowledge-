package com.itheima.demo13;

import java.util.*;
import java.util.function.Function;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */


/*
1.使用lambda表达式分别将以下功能封装到Function对象中
a)求Integer类型ArrayList中所有元素的平均数
b)将Map<String,Integer>中value存到ArrayList<Integer>中
2.已知学生成绩如下
姓名	成绩
岑小村	59
谷天洛	82
渣渣辉	98
蓝小月	65
皮几万	70
3.以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩
* */

public class Demo {
    public static void main(String[] args) {
//        1
        Function<ArrayList<Integer>, Integer> f1 = list -> {
            Integer num = 0;
            for (int i = 0; i < list.size(); i++) {
                num += list.get(i);
            }
            return num / list.size();
        };
//         2
        Function<HashMap<String, Integer>, ArrayList<Integer>> f2 = map -> {
            Collection<Integer> values = map.values();
            return new ArrayList<>(values);
        };
//        3
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("岑小村", 59);
        hashMap.put("渣渣辉", 82);
        hashMap.put("岑小村", 98);
        hashMap.put("蓝小月", 65);
        hashMap.put("皮几万", 70);

        Integer avg=f2.andThen(f1).apply(hashMap);
        System.out.println(avg);


    }
}