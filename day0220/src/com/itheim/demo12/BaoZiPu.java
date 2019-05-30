package com.itheim.demo12;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-02-20 21:43
 */
public class BaoZiPu {
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void setBaoZi(String string) {
        list.add(string);
        this.notify();
    }

    public synchronized String getBaoZi(){
        if (list.size()==0){
            System.out.println("没有包子了，请等待....");
            try {
                this.wait();
                System.out.println("取走一个包子");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       return list.remove(0);
    }

}
