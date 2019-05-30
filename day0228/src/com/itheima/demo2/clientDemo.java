package com.itheima.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-28 10:26
 */
/*
 * 客服端先发信息，再收信息
 * */
public class clientDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Socket socket = new Socket("192.168.134.48"/*"127.0.0.1"*/, 8888)) {
//            while (true) {
                String next = sc.next();
                OutputStream out = socket.getOutputStream();
                out.write(next.getBytes());
                InputStream in = socket.getInputStream();
                byte[] bytes = new byte[1024];
                int len = in.read(bytes);
                System.out.println("收到的信息" + new String(bytes, 0, len));
//            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
