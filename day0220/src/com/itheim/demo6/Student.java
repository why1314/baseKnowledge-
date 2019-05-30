package com.itheim.demo6;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-20 16:53
 */
public class Student {
    private Integer age;

    @Override
    public String

    toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age);
    }

    public Student() {

    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(Integer age) {

        this.age = age;
    }
}
