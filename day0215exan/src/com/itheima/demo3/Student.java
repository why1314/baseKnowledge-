package com.itheima.demo3;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-15 17:34
 */
public class Student {
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(password, student.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, password);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student() {

    }

    public Student(String name, String password) {

        this.name = name;
        this.password = password;
    }

    private String password;
}
