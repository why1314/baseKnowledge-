package com.itheima.demo8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addFirst("4");
        list.addFirst("5");
        list.push("sds");//压栈
//        模拟栈 先进后出
//        while (list.size()>0){
//            System.out.println(list.removeFirst());
//        }
//        while (list.size()>0){
//            System.out.println(list.poll());
//        }

//          模拟队列 先进先出
        while (list.size()>0){
            System.out.println(list.removeLast());
        }
    }

}
