package com.qriosity.day23.thread.basic;

/**
 * @author Queue-ri
 */
public class Thread1 extends Thread {
    // start() --> 동시에 실행할 목록으로 이 스레드 넣어주셈
    // run() --> 동시에 실행할 내용
    
    @Override
    public void run() {
        for (int i = 0; i < 50; ++i) {
            System.out.println("*");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("sleep 실패");
            }
        }
    }
}
