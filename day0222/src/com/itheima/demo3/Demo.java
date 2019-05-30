package com.itheima.demo3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author wz
 * @create 2019-02-22 11:04
 */
public class Demo {
    public static void main(String[] args) {
//        fun(s -> {
//            return Integer.parseInt(s);
//        }, "12");
        fun1(s -> Integer.parseInt(s), s -> {
            s += 10;
            String a = s + "";
            return a;
        }, "20");
        String s = "计划的沙皇";

        fun(() -> "ahdgahs");
        fun(System.out::println, s);
    }


    public static void fun(Supplier<String> supplier) {
        System.out.println(supplier.get());

    }

    public static void fun(Consumer<String> consumer, String string) {
        consumer.accept(string);

    }

//    public static void fun(Function<String, Integer> function, String s) {
//        System.out.println(function.apply(s));
//
//    }


    public static void fun1(Function<String, Integer> f1, Function<Integer, String> f2, String s) {
        f1.andThen(f2).apply(s);
    }
}
