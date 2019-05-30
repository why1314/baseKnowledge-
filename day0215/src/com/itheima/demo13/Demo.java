package com.itheima.demo13;

import java.util.*;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
/*
将该数组里面的所有qq号都存放在LinkedList中，
将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
* */
public class Demo {
    //    public static void main(String[] args) {
//        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
//        HashSet<String> set = new HashSet<String>(Arrays.asList(strs));
////        for (String s : set) {
////            System.out.print(s+",");
////        }
////        set.toArray()
//        LinkedList<String> list = new LinkedList<String>(set);
//        for (String s : list) {
//            System.out.print(s+",");
//        }
//
//    }
    public static void main(String[] args) {
//        构建qq号码的数组
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933","98765432102"};
//        将数组放到linkedlist集合中
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(strs));
//        去除QQ号重复项
        for (int i = 0; i < linkedList.size(); i++) {
            String poll = linkedList.poll();
            if (!linkedList.contains(poll)){
                linkedList.add(poll);
            }else{
                i--;
            }
        }

        for (String s : linkedList) {
            System.out.print(s+",");
        }
    }
}
