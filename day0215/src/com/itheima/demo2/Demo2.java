package com.itheima.demo2;

import java.util.*;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("sahdga");
        set.add("dgsjkad");
        set.add("dshgfhagsdf");
        set.add("杰哈德管理的");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("========================");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
