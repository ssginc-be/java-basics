package com.qriosity.day23.thread.method;

/**
 * @author Queue-ri
 */

// 이미 InterruptMethod 파일에 MyThread 클래스가 있어서 중복 선언 불가능
class MyThread2 extends Thread {
    private String name;
    private int startNumber;
    public MyThread2(String name, int startNumber) {
        this.name = name;
        this.startNumber = startNumber;
    }
    public void run() {
        for (int i = startNumber; i <= 100; i += 2) {
            System.out.println(name + ": " + i);
            // CPU 양보 요청
            Thread.yield();
        }
    }
}

public class YieldMethod {
    public static void main(String[] args) {
        MyThread2 th1 = new MyThread2("even", 0);
        MyThread2 th2 = new MyThread2("odd", 1);

        th1.start();
        th2.start();
    }
}
