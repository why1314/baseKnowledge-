package com.itheim.demo4;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-02-20 15:26
 */
//包子铺
public class BaoZiPu {
    private ArrayList<String> list = new ArrayList<>();

    //    生产者线程调用，生成包子
    public synchronized void setBaoZi(String baoZi) {
        list.add(baoZi);
//      有包子了，唤醒消费者线程
        this.notify();
    }

    //    消费者线程调用，消耗包子
    public synchronized String getBaoZi() {

        if (list.size() == 0) {
            try {
                System.out.println("没有包子了，请等待....");
                this.wait();
                System.out.println("有包子了，先取走一个");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return list.remove(0);
    }

}
