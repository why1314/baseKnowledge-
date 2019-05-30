package com.itheima.demo1;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-27 10:04
 */
//测试员类属性要求：double类型的底薪（basicSalary）、double类型的奖金(bonus)、double类型的绩效(performance)，
// 重写getSalary()方法计算薪资：底薪*绩效+项目奖金
public class TestEngineer implements Employee {
    private double basicSalary;//底薪
    private double bonus;//奖金
    private double performance;//绩效

    @Override
    public String
    toString() {
        return "TestEngineer{" +
                "basicSalary=" + basicSalary +
                ", bonus=" + bonus +
                ", performance=" + performance +
                '}';
    }

    public TestEngineer() {
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEngineer that = (TestEngineer) o;
        return Double.compare(that.basicSalary, basicSalary) == 0 &&
                Double.compare(that.bonus, bonus) == 0 &&
                Double.compare(that.performance, performance) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(basicSalary, bonus, performance);
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

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public TestEngineer(double basicSalary, double bonus, double performance) {

        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.performance = performance;
    }

    @Override
    public double getSalary() {
        return basicSalary*performance+bonus;
    }
}
