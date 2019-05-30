package com.itheima.demo15;


import java.util.*;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
/*
双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色
球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复,即唯一）
* */
public class Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        红色球
        Random rd = new Random();
        while (true){
            int red = rd.nextInt(33) + 1;
            if (set.size()<=6){
                set.add(red);
            }else {
                break;
            }
        }
        
        for (Integer i : set) {
            System.out.print(i+"\t");
        }

        int blue = rd.nextInt(16) + 1;
        set.add(blue);
    }

}
