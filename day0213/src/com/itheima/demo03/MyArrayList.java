package com.itheima.demo03;

/**
 * @author wz
 * @create 2019-02-13 17:57
 */
public class MyArrayList {
    public static  <E>E get(E e){
        return e;
    }

    public static void main(String[] args) {
        System.out.println(get(new Integer(10)).toString());
    }
}
