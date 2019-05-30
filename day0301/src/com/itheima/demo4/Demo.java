package com.itheima.demo4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author wz
 * @create 2019-03-01 16:09
 */
//junit单元测试
public class Demo {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        show();
    }

    @Test
    public void test1() {
        show();
    }

    @After
    public void show3() {
        System.out.println("show3");
    }

    @After
    public void show4() {
        System.out.println("show4");
    }

    public static void show() {
        System.out.println("show");
    }

    @BeforeClass
    public static void show1() {
        System.out.println("static show1");
    }

    @BeforeClass
    public static void show2() {
        System.out.println("static show2");
    }
}

