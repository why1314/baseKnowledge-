package com.itheima.demo10;

/**
 * @author wz
 * @create 2019-02-23 20:47
 */
@FunctionalInterface
public interface ArrayBuilder<T> {
    T[] buildArray(int length);
}
