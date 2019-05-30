package com.itheima.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hsdfa");
        list.add("dshgas");
        System.out.println(list);
        list.add(1,"dgahsd");
        System.out.println(list);
        System.out.println(list.set(1, "ww"));
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.remove(1));
        System.out.println(list);


    }

}
