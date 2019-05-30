package com.itheima.demo1;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-22 8:02
 */
public class Student {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String breithday;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", breithday='" + breithday + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                score == student.score &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(breithday, student.breithday);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, sex, age, breithday, score);
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreithday() {
        return breithday;
    }

    public void setBreithday(String breithday) {
        this.breithday = breithday;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {

    }

    public Student(int id, String name, String sex, int age, String breithday, int score) {

        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.breithday = breithday;
        this.score = score;
    }
}
