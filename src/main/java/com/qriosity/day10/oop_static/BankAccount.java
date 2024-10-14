package com.qriosity.day10.oop_static;

/**
 * @author Queue-ri
 */
public class BankAccount {
    String name;
    String ssn;
    int money;
    // count: 객체 생성 횟수 카운터
    // static 변수는 객체생성과 상관없이 클래스에서 바로 접근해서 사용 가능
    // 정적변수 == static 변수 == 클래스 변수
    static int count; // 기본 0으로 초기화됨
    
    public BankAccount(String name, String ssn, int money) {
        this.name = name;
        this.ssn = ssn;
        this.money = money;
        ++count;
    }

    @Override
    public String toString() {
        return "BankAccount{name='" + name + "', ssn='" + ssn + "', money=" + money + "}";
    }
}
