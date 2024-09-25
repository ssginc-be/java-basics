package com.qriosity.day1.var;

/**
 * @author Queue-ri
 */
public class Basic2 {
    public static void main(String[] args) {
        System.out.println("* * * 기본형 연습 2 * * *");
        // 가을 관련 요소
        final int MONTH = 10;
        final double TEMP = 21.5;
        final char COLOR = 'b'; // brown
        final boolean RAIN = false;
        // final: 변경불가 상수, 변수명은 대문자 컨벤션 존재
        System.out.println("월: " + MONTH);
        System.out.println("온도: " + TEMP);
        System.out.println("색깔: " + COLOR);
        System.out.println("우천 여부: " + RAIN);
    }
}
