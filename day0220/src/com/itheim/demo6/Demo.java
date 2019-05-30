package com.itheim.demo6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wz
 * @create 2019-02-20 16:53
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(10));
        list.add(new Student(12));
        list.add(new Student(9));
        list.add(new Student(17));

        Collections.sort(list,(s1,s2)->{return s2.getAge()-s1.getAge();});
        System.out.println(list);
    }
}
