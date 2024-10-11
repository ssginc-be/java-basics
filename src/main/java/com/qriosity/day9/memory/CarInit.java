package com.qriosity.day9.memory;

/**
 * @author Queue-ri
 */
public class CarInit {
    public static void main(String[] args) {
        // new: 힙 영역에 멤버들이 생성됨
        Car car1 = new Car(); // 같은 패키지여서 import가 없음
        System.out.println(car1.size); // 자동 초기화되어있음
        car1.size = 10;
        car1.speed = 20;

    }
}
