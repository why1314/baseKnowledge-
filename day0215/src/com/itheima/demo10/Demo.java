package com.itheima.demo10;

import com.itheima.demo3.Student;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("ww",19));
        hashSet.add(new Student("xx",19));
        hashSet.add(new Student("wq",19));
        hashSet.add(new Student("ww",19));
        for (Student stu : hashSet) {
            System.out.println(stu);
        }
    }

}
