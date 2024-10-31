package com.qriosity.day23.thread.basic;

import org.apache.poi.ss.formula.functions.T;

/**
 * @author Queue-ri
 */
public class ThreadMainAnonymClass {
    // ThreadMain과 달리 익명클래스로 정의하여 사용
    // --> 실무에서 선호(기존 방식은 파일 따로 관리 힘들어서)
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i)
                    System.out.println("나는 &&&&&");
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i)
                    System.out.println("나는 ***");
            }
        };

        t1.start();
        t2.start();
    }
}
