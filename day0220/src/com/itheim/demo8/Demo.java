package com.itheim.demo8;

/**
 * @author wz
 * @create 2019-02-20 17:24
 */
public class Demo {
    public static void main(String[] args) {
        invokeDirect(()->{
            System.out.println("导演拍电影啦！");
        });
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
