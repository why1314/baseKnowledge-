package com.czxy.model;

import java.util.Objects;

/**
 * @author zhangjian1@itcast.cn
 * @date 2018/12/27
 * @infos
 */
public class Student {
    private String name;//姓名
    private String sex;//性别
    private String phone;//手机

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sex, phone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Student() {

    }

    public Student(String name, String sex, String phone) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
