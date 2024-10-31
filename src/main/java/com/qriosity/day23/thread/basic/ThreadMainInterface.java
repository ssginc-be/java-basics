package com.qriosity.day23.thread.basic;

/**
 * @author Queue-ri
 */
public class ThreadMainInterface {
    // 인터페이스는 new(생성) 안됨
    // 따라서 Runnable 작성 필수
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i)
                    System.out.println("나는 &&&&&");
            }
        };
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i) {
                    System.out.println("나는 %%%%%%%");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
