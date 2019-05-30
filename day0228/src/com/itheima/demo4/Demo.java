package com.itheima.demo4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wz
 * @create 2019-02-28 21:26
 */
//服务器
public class Demo {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(7777)) {
            while (true) {
                Socket socket = server.accept();
                new Thread(() -> {
                    BufferedReader bufReader = null;
                    try {
                        bufReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));


                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }).start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
