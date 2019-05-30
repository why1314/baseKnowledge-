package com.itheima.demo3;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Objects;

/**
 * @author wz
 * @create 2019-02-18 20:16
 */
public class Role {
    private String name;
    private Double shengmingzhi;

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", shengmingzhi=" + shengmingzhi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(name, role.name) &&
                Objects.equals(shengmingzhi, role.shengmingzhi);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, shengmingzhi);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getShengmingzhi() {
        return shengmingzhi;
    }

    public void setShengmingzhi(Double shengmingzhi) throws ShengmingzhiException {
        if (shengmingzhi<0){
            throw new ShengmingzhiException("生命值不能负数");
        }
        this.shengmingzhi = shengmingzhi;
    }

    public Role() {

    }

    public Role(String name, Double shengmingzhi) {

        this.name = name;
        this.shengmingzhi = shengmingzhi;
    }
}
