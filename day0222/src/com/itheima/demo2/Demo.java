package com.itheima.demo2;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author wz
 * @create 2019-02-22 9:23
 */
@FunctionalInterface
interface IA {
    void show();

    boolean equals(Object o);

}

public class Demo {
    public static void main(String[] args) {
        String s1="hadsgdajgdlauds";
        Consumer consumer = s -> System.out.println(s1.toUpperCase());
        consumer.accept(s1);

        fun(s -> System.out.println(s.toUpperCase()),"hdgavskuhd");

//        Supplier supplier = () -> "sdjglas";
//        fun(supplier);
    }



    public static void fun(Supplier<String> supplier) {
        String o = supplier.get();
        System.out.println(o);
    }
    public static void fun(Consumer<String> consumer,String string) {
         consumer.accept(string);

    }
}
