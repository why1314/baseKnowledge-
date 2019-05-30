package com.itheima.demo3;

import java.io.File;
import java.io.IOException;

/**
 * @author wz
 * @create 2019-02-23 9:22
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(fun(6));
    }

    public static int fun(int num) {
        if (num == 1) {
            return 1;
        }
        int i = num * fun(num - 1);
        return i;
    }
}
