package com.itheima.demo5;

/**
 * @author wz
 * @create 2019-03-01 16:32
 */
public class Student {
    private String name;
    public int age;

    public Student() {
        System.out.println(1);
    }
    private Student(String name) {
        System.out.println(2);
        this.name = name;
    }

    public Student(String name, int age) {
        System.out.println(3);
        this.name = name;
        this.age = age;
    }

    protected Student( int age) {
        System.out.println(4);
        this.age = age;
    }

    public String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}
