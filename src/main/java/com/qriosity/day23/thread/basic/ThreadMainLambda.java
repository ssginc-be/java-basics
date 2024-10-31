package com.qriosity.day23.thread.basic;

/**
 * @author Queue-ri
 */
public class ThreadMainLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <100; ++i) {
                System.out.println("((((((");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100; ++i) {
                    System.out.println("))))))");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
