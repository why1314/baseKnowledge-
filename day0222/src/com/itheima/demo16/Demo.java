package com.itheima.demo16;
//：取用前几个：limit、跳过前几个：skip

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
/*
已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
1、取出前2个元素并在控制台打印输出。
2、取出后2个元素并在控制台打印输出。
* */

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "陈玄风", "梅超风", "陆乘风", "曲灵风", "武眠风", "冯默风", "罗玉风");
        list.stream().limit(2).forEach( System.out::println);
        list.stream().skip(list.size()-2).forEach( System.out::println);

    }
}