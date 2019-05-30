package com.itheim.demo10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wz
 * @create 2019-02-20 17:45
 */
public class demo {
    public static void main(String[] args) {
//        ArrayList<Student> stuList = new ArrayList<>();
        Student[] stu = new Student[]{
                new Student("dsga", 77),
                new Student("hsdahsd", 37),
                new Student("dhhdjd", 57),
                new Student("aada", 79)};

//        Arrays.sort(stu,(Student s1,Student s2)->{return s2.getScore()-s1.getScore();});
        Arrays.sort(stu, (s1, s2) -> s2.getScore() - s1.getScore());
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }

    }
}
