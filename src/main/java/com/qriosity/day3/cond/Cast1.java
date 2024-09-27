package com.qriosity.day3.cond;

public class Cast1 {
    public static void main(String[] args) {
        // 다른 타입 변수에 할당해야 하는 경우
        // 작은 공간에서 큰 공간으로 넣을땐 자동으로 캐스팅 된다.
        // 묵시적 형변환
        byte x = 100;
        int y = x;

        // 큰 공간에서 작은 공간으로 넣을땐 강제로 캐스팅해야 한다.
        // 명시적 형변환
        int x2 = 127;
        byte y2 = (byte)x2;
        System.out.println(y2);

        int x3 = 128;
        byte y3 = (byte)x3; // 에러: byte 타입의 최대값(127) 초과
        System.out.println("err: " + y3);
    }
}
