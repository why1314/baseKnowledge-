package com.itheima.demo08;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hdsjhasdgja");
        list.add("dhgajs");
        list.add("asdfasd");
        list.add("addaasd");
        System.out.println(listTest(list));
    }
public static Boolean listTest(ArrayList<String> al){
        return al.isEmpty();
}

}
