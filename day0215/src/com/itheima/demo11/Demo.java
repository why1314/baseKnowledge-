package com.itheima.demo11;

import java.util.*;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        for (String s : list) {
            System.out.print(s+",");
        }
        System.out.println();
        list.set(3,"王小丫");
        for (String s : list) {
            System.out.print(s+",");
        }
    }

}
