package com.itheima.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-13 18:12
 */
public class douDiZhu {
    public static void main(String[] args) {
//        封装一副扑克牌
        String[] color = {"♥", "♠", "♣", "♦"};
        String[] numbers = {"2", "3", "4", "5", "7", "8", "A", "6", "9", "J", "10", "Q", "K"};
        ArrayList<String> list = new ArrayList<>();
        for (String c : color) {
            for (String n : numbers) {
                list.add(c+n);
            }
        }
        list.add("小王");
        list.add("大王");
//        洗牌
        xiPai(list);
//        发扑克牌
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> di = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i>=list.size()-3){
                di.add(list.get(i));
            }else {
                if (i%3==0){
                    list1.add(list.get(i));
                }
                if (i%3==1){
                    list2.add(list.get(i));
                }
                if (i%3==2){
                    list3.add(list.get(i));
                }
            }
        }

        System.out.println("陈赫"+list1);
        System.out.println("邓超"+list2);
        System.out.println("宝强"+list3);
        System.out.println("底牌"+di);

    }

    public static void xiPai(ArrayList<String> list) {
        System.out.println("【请问要洗几次扑克牌】");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            Collections.shuffle(list);
        }
    }
}
