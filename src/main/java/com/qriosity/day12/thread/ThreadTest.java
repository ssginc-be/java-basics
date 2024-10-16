package com.qriosity.day12.thread;

/**
 * @author Queue-ri
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

        th1.start();
        th2.start();
    }
}
