package com.qriosity.day23.thread.basic;

/**
 * @author Queue-ri
 */
public class ThreadMain {
    // ThreadImpl 테스트
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadImpl());
        Thread t2 = new Thread(new ThreadImpl2());

        t1.start();
        t2.start();
    }
}
