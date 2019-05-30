package com.itheima.demo5;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * @author wz
 * @create 2019-02-16 9:22
 */
/*斗地主*/
public class Demo {
    public static void main(String[] args) {
//        封装一副扑克牌
        String[] colors = {"♥", "♣", "♠", "♦"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "1", "2"};
        Map<Integer, String> map = new HashMap<>();
        int index = 0;
        map.put(index++, "小王");
        map.put(index++, "大王");

        for (String c : colors) {
            for (String n : nums) {
                map.put(index++, c + n);
            }
        }
//        洗牌
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.shuffle(list, new Random(5));

//        发牌
        ArrayList<Integer> user1 = new ArrayList<>();
        ArrayList<Integer> user2 = new ArrayList<>();
        ArrayList<Integer> user3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i >= list.size() - 3) {
                diPai.add(list.get(i));
            } else {
                if (i % 3 == 1) {
                    user1.add(list.get(i));
                } else if (i % 3 == 2) {
                    user2.add(list.get(i));
                } else if (i % 3 == 0) {
                    user3.add(list.get(i));
                }
            }
        }
//        排序
        Collections.sort(user1);
        Collections.sort(user2);
        Collections.sort(user3);
        Collections.sort(diPai);

//        看牌
        System.out.print("user1: ");
        loopPK(user1,map);

        System.out.print("user2: ");
        loopPK(user2,map);

        System.out.print("user3: ");
        loopPK(user3,map);

        System.out.print("diPai: ");
        loopPK(diPai,map);
    }

    private static void loopPK(ArrayList<Integer> list, Map<Integer, String> map) {
        StringBuilder builder = new StringBuilder("[");
//        for (Integer i : list) {
//            builder.append(map.get())
//        }
        for (int i = 0; i < list.size(); i++) {
            builder.append(map.get(list.get(i)));
            if (i<list.size()-1){
                builder.append(",");
            }else {
                builder.append("]");
            }
        }

        System.out.println(builder.toString());


    }
}
