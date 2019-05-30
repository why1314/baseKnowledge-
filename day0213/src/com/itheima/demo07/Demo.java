package com.itheima.demo07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println(listTest(list, "dsd"));
    }
public static Boolean listTest(ArrayList<String> al, String s){
        return al.contains(s);
}

}
