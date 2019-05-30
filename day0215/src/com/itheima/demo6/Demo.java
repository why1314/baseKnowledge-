package com.itheima.demo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {
    public static void main(String[] args) {

        ArrayList<Student> integers = new ArrayList<>();
        Collections.addAll(integers,new Student("SHD",10),new Student("EYYUW",11));

        Collections.sort(integers, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        for (Student i : integers) {
            System.out.println(i);
        }
    }

}
