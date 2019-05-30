package com.itheima.demo3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("WW", 13));
        set.add(new Student("WW", 13));
        set.add(new Student("xx", 12));
        for (Student s : set) {
            System.out.println(s);
        }

    }
    public static void get(Integer ... num){

    }

}
