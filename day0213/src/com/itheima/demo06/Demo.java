package com.itheima.demo06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(12);
        list.add(13);
        list.add(11);
        list.add(19);
        Object[] array = list.toArray();
        for (Object o : array) {
            System.out.println(o);
        }
        List<Object> objects = Arrays.asList(array);
        for (Object o : objects) {
            System.out.println(o);
        }
    }


}
