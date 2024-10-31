package com.qriosity.day23.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Queue-ri
 */
public class FixedThreadPoolTest1 {
    public static void main(String[] args) {
        // 3개의 스레드를 가진 고정 스레드 풀 생성
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 작업을 여러 개 제출
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " 스레드 실행 중 " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // 작업을 2초 동안 실행
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskNumber + " 인터럽트되어 중단");
                }
                System.out.println("Task " + taskNumber + " 스레드 실행 완료");
            });
        }
        // 모든 작업이 완료되면 스레드 풀 종료
        //
        executor.shutdown();
        System.out.println("스레드 풀 전체 셧다운");
    }
}