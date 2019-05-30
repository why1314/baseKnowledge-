package com.itheima.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author wz
 * @create 2019-02-13 9:19
 */
//public boolean remove(E e) 移除指定元素
//public boolean removeAll(Collection<? ectends E> c)移除指定集合的元素
public class Demo02 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("ajgdh");
        list.add("ahsdgfukas");
        list.add("12612");
        System.out.println(list);
        System.out.println(list.remove("ajgdh"));
//        list.clear();
        System.out.println(list);
       

    }

}
