package com.qriosity.day23.thread.method;

/**
 * @author Queue-ri
 */
public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> { // 람다식으로 생성
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> { // 람다식으로 생성
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();

        // 메인 스레드에서 count 값을 출력 (join() 메서드 필요)
        t1.join(); // t1 끝나고 아래 줄 도달해야 함
        t2.join(); // t2 끝나고 아래 줄 도달해야 함

        System.out.println("Final count: " + counter.getCount());
    }
}

class Counter {
    private int count = 0;

    // synchronized --> atomic operation 제공 (=동기화)
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
