package com.itheim.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/**
 * @author wz
 * @create 2019-02-19 7:59
 */
//斗地主
public class Demo {
    public static void main(String[] args) {
//        封装一副扑克
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int index = 0;
        HashMap<Integer, String> map = new HashMap<>();
        for (String c : colors) {
            for (String n : nums) {
                map.put(index++, c + n);
            }
        }

        map.put(index++, "小王");
        map.put(index++, "大王");
//      洗牌
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.shuffle(list, new Random(5));

        ArrayList<Integer> user1 = new ArrayList<>();
        ArrayList<Integer> user2 = new ArrayList<>();
        ArrayList<Integer> user3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
//        发牌
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

        Collections.sort(user1);
        Collections.sort(user2);
        Collections.sort(user3);
        Collections.sort(diPai);

//        看牌
        System.out.print("user1 :");
        loopPK(map,user1);
        System.out.print("user2 :");
        loopPK(map,user2);
        System.out.print("user3 :");
        loopPK(map,user3);
        System.out.print("diPai :");
        loopPK(map,diPai);


    }

    private static void loopPK(HashMap<Integer, String> map, ArrayList<Integer> list) {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            builder.append(map.get(list.get(i)));
            if (i!=list.size()-1){
                builder.append(",");
            }else {
                builder.append("]");
            }
        }
        System.out.println(builder.toString());
    }
}
