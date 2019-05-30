package com.itheima.demo15;
//：过滤：filter、结果收集(数组)

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
/*
有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，
郭破虏，使用Stream将以郭字开头的元素存入新数组
* */

public class Demo {
    public static void main(String[] args) {
        String[] strings = Stream.of("冯蘅", "黄药师", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏")
                .filter(string -> string.startsWith("郭")).toArray(String[]::new);

        for (String s : strings) {
            System.out.println(s);
        }
    }
}