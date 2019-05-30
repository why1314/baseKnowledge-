package com.itheima.demo1;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-27 10:04
 */
//经理类
public class Manager implements Employee {
    private double basicSalary;//底薪
    private double performance;//绩效0-1.5之间

    @Override
    public double getSalary() {
        return basicSalary *performance;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "basicSalary=" + basicSalary +
                ", performance=" + performance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.basicSalary, basicSalary) == 0 &&
                Double.compare(manager.performance, performance) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(basicSalary, performance);
    }

    public double getBasicSalary() {

        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public Manager() {
    }

    public Manager(double basicSalary, double performance) {

        this.basicSalary = basicSalary;
        this.performance = performance;
    }


}
