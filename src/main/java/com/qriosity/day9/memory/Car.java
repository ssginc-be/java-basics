package com.qriosity.day9.memory;

/**
 * @author Queue-ri
 */
public class Car {
    int size;
    int speed;

    public String print() {
        return size + " " + speed;
    }

    public void hi() {
        int tmp = 10; // 지역변수는 기본초기화 안함
        System.out.println("속도를 Speed Up!: " + tmp);
        System.out.println(print()); // println이 먼저 실행되고 그 다음 print가 수행됨
    }
}
