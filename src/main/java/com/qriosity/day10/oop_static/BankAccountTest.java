package com.qriosity.day10.oop_static;

/**
 * @author Queue-ri
 */
public class BankAccountTest {
    public static void main(String[] args) {
        //인스턴스 변수 --> 3개
        //인스턴스 변수는 생성된 객체(클래스의 인스턴스)의 실제값(인스턴스)을
        //저장하기 위한 변수
        //==> 객체생설할 때마다 힙영역에 생긴다.!
        BankAccount dad = new BankAccount("홍길동", "050505", 10000);
        System.out.println(dad);
        // dad.count 이런식으로 인스턴스 레퍼런스로도 접근할 수 있지만
        // 그러면 마치 count가 인스턴스 변수인것처럼 보이기에 보통 그렇게 작성하지 않음
        System.out.println(BankAccount.count);

        BankAccount me = new BankAccount("홍길순", "090505", 5000);
        System.out.println(me);
        System.out.println(BankAccount.count);
    }
}
