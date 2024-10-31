package com.qriosity.day23.thread.method;

/**
 * @author Queue-ri
 */
public class InterruptMethod {
    public static void main(String[] args) {
        // sleep하면 중지상태로 가고, awake하면 실행대기
        // 스레드 생성하고 2초 후에 인터럽트로 스레드 깨우기
        MyThread th = new MyThread();
        th.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("ㅎㅇ");
        }
        th.interrupt(); // 인터럽트
    }
}

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is sleeping...");
            Thread.sleep(5000); // 5초 대기
            System.out.println("Thread is awake!");
        } catch (InterruptedException e) {
            // 인터럽트 발생 시 처리 코드 작성
            System.out.println("ㅎㅇㅎㅇ");
        }
    }
}
