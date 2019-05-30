package com.itheima.demo1;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-18 19:23
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) throws ScoreException {
        if (score<0){
            throw new ScoreException("分数不能为负值");
        }
        this.score = score;
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

    public Student() {

    }

    public Student(String name, Integer score) {

        this.name = name;
        this.score = score;
    }
}
