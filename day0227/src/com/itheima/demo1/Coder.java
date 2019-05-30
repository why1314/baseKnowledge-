package com.itheima.demo1;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-27 10:04
 */
//程序员类
public class Coder implements Employee {
    private double basicSalary;//底薪
    private double bonus;//项目奖金


    @Override
    public String toString() {
        return "Coder{" +
                "basicSalary=" + basicSalary +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coder coder = (Coder) o;
        return Double.compare(coder.basicSalary, basicSalary) == 0 &&
                Double.compare(coder.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(basicSalary, bonus);
    }

    public double getBasicSalary() {

        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Coder() {
    }

    public Coder(double basicSalary, double bonus) {

        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return basicSalary + bonus;
    }


}
