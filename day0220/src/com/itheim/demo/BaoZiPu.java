package com.itheim.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wz
 * @create 2019-02-20 9:48
 */
public class BaoZiPu {
    private List<String> baoZiList = new ArrayList<>();

    public synchronized String getBaoZi() {
        if (baoZiList.size() == 0) {
            try {
                System.out.println("来去包子，但没有了，等待.....");
                this.wait();
                System.out.println("有包子了，取走一个");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return baoZiList.remove(0);
    }

    public synchronized void setBaoZi(String baoZi) {
        baoZiList.add(baoZi);
        this.notify();
    }
}
