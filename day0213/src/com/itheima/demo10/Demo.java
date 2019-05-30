package com.itheima.demo10;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("www", 18, "男"));
        list.add(new Student("qqq", 16, "男"));
        list.add(new Student("eee", 14, "男"));
        list.add(new Student("ttt", 13, "女"));
        for (Student s : list) {
            System.out.println(s);
        }
        Integer maxAge = getMaxAge(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() == maxAge) {
                list.get(i).setName("小猪佩奇");
            }
        }

        for (Student s : list) {
            System.out.println(s);
        }
    }

    public static Integer getMaxAge(ArrayList<Student> list) {
        Integer maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            if (maxAge < list.get(i).getAge()) {
                maxAge = list.get(i).getAge();
            }
        }
        return maxAge;
    }
}
