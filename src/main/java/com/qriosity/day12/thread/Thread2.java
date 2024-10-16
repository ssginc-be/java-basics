package com.qriosity.day12.thread;

/**
 * @author Queue-ri
 */
public class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 101; ++i) {
            System.out.println("증가>> " + i);
        }
    }
}
