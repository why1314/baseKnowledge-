package com.itheim.demo1;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-19 8:12
 */
public class Student {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String brithday;
    private Integer score;

    public Student() {
    }

    public Student(Integer id, String name, String sex, Integer age, String brithday, Integer score) {

        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.brithday = brithday;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", brithday='" + brithday + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(age, student.age) &&
                Objects.equals(brithday, student.brithday) &&
                Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, sex, age, brithday, score);
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
