package com.qriosity.day1.var;

/**
 * @author Queue-ri
 */
public class Basic3 {
    public static void main(String[] args) {
        System.out.println("* * * 기본형 연습 3 * * *");

        // 정수: byte(127), short, int, long
        byte age = 12;
        short count = 25000;
        int money = 1000000;
        long bank = 2222222222L; // 리터럴 필수, 안쓰면 int로 인식함
        System.out.println("나이: " + age);
        System.out.println("카운트: " + count);
        System.out.println("금액: " + money);
        System.out.println("텅장 잔액: " + bank);
        System.out.println();

        // 실수: float, double
        float f = 123.456f; // 리터럴 필수, 안쓰면 double로 인식함
        double d = 999.999999999;
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println();

        // 문자열
        String bankName = "카카오뱅크"; // 문자열은 0글자 이상으로 구성 가능
        System.out.println("은행명: " + bankName);
    }
}
