package com.qriosity.day23.thread.basic;

/**
 * @author Queue-ri
 */
public class Thread3 extends Thread {
    // start() --> 동시에 실행할 목록으로 이 스레드 넣어주셈
    // run() --> 동시에 실행할 내용
    // Thread가 추상클래스였으면 다른 함수 다 강제로 오버라이딩 하라고 오류 뜨는데
    // 안뜨는거 보니까 Thread는 일반클래스임을 알 수 있음
    
    @Override
    public void run() {
        for (int i = 0; i < 50; ++i) {
            System.out.println("###");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("sleep 실패");
            }
        }
    }
}
