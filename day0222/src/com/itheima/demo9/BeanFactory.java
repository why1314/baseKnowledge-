package com.itheima.demo9;

/**
 * @author wz
 * @create 2019-02-23 20:43
 */
@FunctionalInterface
public interface BeanFactory<T> {
    T getBean();
}
