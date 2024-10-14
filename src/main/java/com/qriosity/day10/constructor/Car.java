package com.qriosity.day10.constructor;

/**
 * @author Queue-ri
 */
public class Car {
    String model;
    String color;
    int maxSpeed;

    // 컴파일 시 묵시적 생성자가 자동으로 생성된다
    // public Car() {}

    public void speedUp() {
        System.out.println("속도 UP!");
    }
}
