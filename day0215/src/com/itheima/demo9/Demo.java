package com.itheima.demo9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        Iterator<Integer> it = set.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        for (Integer t : set) {
            System.out.println(t);
        }
    }

}
