package com.qriosity.day23.thread.basic;

/**
 * @author Queue-ri
 */
public class ThreadImpl2 implements Runnable {
    // Runnable 만으로 스레드 생성 불가능
    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println("나는 @@");
        }
    }
}
