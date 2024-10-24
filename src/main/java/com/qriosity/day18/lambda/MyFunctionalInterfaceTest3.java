package com.qriosity.day18.lambda;

/**
 * @author Queue-ri
 */

// 인터페이스 사용 방법 3가지
// 3. 람다식(람다함수,익명함수)으로 바로 구현해서 사용
public class MyFunctionalInterfaceTest3 {
    public static void main(String[] args) {
        MyFunctionalInterface my = () -> System.out.println("3번 이름없는 클래스로 구현한 결과");
        my.myMethod();
    }
}