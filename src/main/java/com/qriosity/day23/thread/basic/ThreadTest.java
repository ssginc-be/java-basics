package com.qriosity.day23.thread.basic;

/**
 * @author Queue-ri
 */
public class ThreadTest {
    // Thread 1, 2, 3 테스트
    public static void main(String[] args) {
        // 메인스레드 + Thread 1,2,3 실행
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        // 순서는 상관없고 스케줄러에 들어가서 동시에 처리되는것처럼 보이게 됨
        t1.start();
        t2.start();
        t3.start();
    }
}
