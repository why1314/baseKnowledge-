package com.itheima.demo;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wz
 * @create 2019-02-18 7:52
 */
//斗地主
public class Demo {
    public static void main(String[] args) {
//       封装一副扑克
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        Map<Integer, String> map = new HashMap<>();
        int index = 0;
        map.put(index++, "小王");
        map.put(index++, "大王");

        for (String c : colors) {
            for (String n : nums) {
                map.put(index++, c + n);
            }
        }
//   洗牌
        ArrayList<Integer> key = new ArrayList<>(map.keySet());
        Collections.shuffle(key);

//        发牌
        ArrayList<Integer> user1 = new ArrayList<>();
        ArrayList<Integer> user2 = new ArrayList<>();
        ArrayList<Integer> user3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        for (int i = 0; i < key.size(); i++) {
            if (i>=key.size()-3){
                diPai.add(key.get(i));
            }else {
                if (i%3==1){
                    user1.add(key.get(i));
                }else if (i%3==2){
                    user2.add(key.get(i));
                }if (i%3==0){
                    user3.add(key.get(i));
                }
            }
        }

//        排序
        Collections.sort(user1);
        Collections.sort(user2);
        Collections.sort(user3);
        Collections.sort(diPai);



    }
}
