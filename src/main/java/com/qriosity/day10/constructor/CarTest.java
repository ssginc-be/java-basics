package com.qriosity.day10.constructor;

/**
 * @author Queue-ri
 */
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "테슬라";
        c1.color = "검정";
        c1.maxSpeed = 140;

        System.out.println(c1.model + " " + c1.color + " " + c1.maxSpeed);
        c1.speedUp();

        // 생성자 사용하여 멤버변수 초기화
        Car2 c2 = new Car2("gv80", "회색", 150);
        System.out.println(c2.model + " " + c2.color + " " + c2.maxSpeed);
        c2.speedUp();
        System.out.println(c2.toString());
    }
}
