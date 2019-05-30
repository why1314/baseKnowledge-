package com.itheima.demo8;

/**
 * @author wz
 * @create 2019-02-23 20:11
 */
@FunctionalInterface
public interface NumberSupplier {
    int getNum(int...nums);
}
