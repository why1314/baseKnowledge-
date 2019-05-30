package com.itheima.demo4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {
    public static void main(String[] args) {
        Set<Student> set = new LinkedHashSet<>();
        set.add(new Student("ww", 19));
        set.add(new Student("ww", 19));
        set.add(new Student("xx", 18));
        for (Student s : set) {
            System.out.println(s);
        }
    }

}
