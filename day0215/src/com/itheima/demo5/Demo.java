package com.itheima.demo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {
    public static void main(String[] args) {

        ArrayList<Student> integers = new ArrayList<>();
        Collections.addAll(integers,new Student("SHD",12),new Student("EYYUW",11));
        Collections.sort(integers);
        for (Student i : integers) {
            System.out.println(i);
        }
    }

}
