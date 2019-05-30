package com.itheima.demo3;

import java.util.*;

/**
 * @author wz
 * @create 2019-02-16 9:22
 */
/*
扑克牌练习
* */
public class Demo {
    public static void main(String[] args) {
//        封装一副扑克
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] nums = {"2", "A", "K", "J", "Q", "3", "4,", "6", "7", "5", "9", "8", "10"};
        HashMap<Integer, String> map = new HashMap<>();

        int index = 0;
        map.put(index++, "大王");
        map.put(index++, "小王");
        for (String s : colors) {
            for (String num : nums) {
                map.put(index++, s + num);
            }
        }

//        洗牌
        ArrayList<Integer> indexlist = new ArrayList<>(map.keySet());
        Collections.shuffle(indexlist, new Random(5));
//    发牌
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> diList = new ArrayList<>();

        for (int i = 0; i < indexlist.size(); i++) {
            if (i >= indexlist.size() - 3) {
                diList.add(indexlist.get(i));
            } else {
                if (i % 3 == 0) {
                    list1.add(indexlist.get(i));
                } else if (i % 3 == 1) {
                    list2.add(indexlist.get(i));
                } else if (i % 3 == 2) {
                    list3.add(indexlist.get(i));
                }
            }
        }
//        排序
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(diList);

//      看牌
        System.out.print("小布 ：");
        loopPK(list1, map);
        System.out.print("小胖 ：");
        loopPK(list2, map);
        System.out.print("小普 ：");
        loopPK(list3, map);
        System.out.print("底牌 ：");
        loopPK(diList, map);


    }

    private static void loopPK(ArrayList<Integer> list, HashMap<Integer, String> map) {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            builder.append(map.get(list.get(i)));
            if (i < list.size() - 1) {
                builder.append(", ");
            } else {
                builder.append("]");
            }
        }
        System.out.println(builder.toString());
    }
}
