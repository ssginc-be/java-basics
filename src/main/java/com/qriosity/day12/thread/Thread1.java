package com.qriosity.day12.thread;

/**
 * @author Queue-ri
 */
public class Thread1 extends Thread {
    // run(): 동시에 실행하고 싶은 코드

    @Override
    public void run() {
        for (int i = 100; i > 0; --i) {
            System.out.println("감소>> " + i);
        }
    }

    // start(): run() 안의 코드 동시에 실행하라고 시작
}
