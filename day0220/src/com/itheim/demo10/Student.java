package com.itheim.demo10;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-20 16:53
 */
public class Student {
    private String name;
    private Integer score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, score);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student() {

    }

    public Student(String name, Integer score) {

        this.name = name;
        this.score = score;
    }
}
