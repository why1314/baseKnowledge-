package com.itheima.demo11;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
public class Demo {
    public static void main(String[] args) {
//        a)长度为5的String数组
        getObj(() -> new String[5]);
//        getObj(String::new);

//        b)包含5个1-20(含1和20)之间随机数的HashSet<Integer>集合
        HashSet<Integer> hashSet = getObj(() -> {
            HashSet<Integer> set = new HashSet<>();
            Random rd = new Random();

            for (int i = 0; i < 5; i++) {
                int num = rd.nextInt(20) + 1;
                if (set.size() != 0) {
                    boolean is = false;
                    for (Integer integer : set) {
                        if (num == integer) {
                            i--;
                            is = true;
                            break;
                        }
                    }
                    if (!is) {
                        set.add(num);
                    }
                } else {
                    set.add(num);
                }
            }
            return set;
        });

        for (Integer integer : hashSet) {
            System.out.println(integer);
        }
//        c)一个代表2018年4月1日的Calendar对象
        Calendar calendar1 = getObj(() -> {
            Calendar calendar = new GregorianCalendar(2018, 4, 1);
            return calendar;
        });
        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONTH));
        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));
    }

    public static <T> T getObj(Supplier<T> supplier) {
        return supplier.get();
    }
}
