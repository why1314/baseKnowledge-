package com.itheima.demo14;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
/*
键盘录入一个字符串，去掉其中重复字符，
打印出不同的那些字符，必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。* */

/*
ArrayList集合中有如下内容： {33,11,77,55}，
使用Collections.sort()对ArrayList集合中的数据进行排序，并打印出排序后的结果。
* */
public class Demo {
    public static void main(String[] args) {
//        System.out.println("请输入一个字符串");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        Set<Character> set = new LinkedHashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            set.add(str.charAt(i));
//        }
//        for (Character c : set) {
//            System.out.print(c);
//        }
        Integer[] integers={33,11,77,55};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integers));
        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i+"\t");
        }

    }

}
