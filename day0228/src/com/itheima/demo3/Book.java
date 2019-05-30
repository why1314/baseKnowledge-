package com.itheima.demo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author wz
 * @create 2019-02-28 20:47
 */
@Target({ElementType.TYPE})
@interface Book {
    //    书名
    String value();

    //    价格
    double price() default 100;

    //    作者
    String[] authors();
}
