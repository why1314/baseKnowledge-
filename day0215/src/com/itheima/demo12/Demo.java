package com.itheima.demo12;

import java.util.*;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {
    public static void main(String[] args) {
        Set<String> list = new LinkedHashSet<String>();
        list.add("王昭君");
        list.add("王昭君");
        list.add("西施");
        list.add("杨玉环");
        list.add("貂蝉");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("===============");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
