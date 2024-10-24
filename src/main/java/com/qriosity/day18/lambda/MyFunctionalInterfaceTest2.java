package com.qriosity.day18.lambda;

/**
 * @author Queue-ri
 */

// 인터페이스 사용 방법 3가지
// 1. 이름없는 클래스(=익명클래스)로 바로 구현해서 사용
public class MyFunctionalInterfaceTest2 {
    public static void main(String[] args) {
        MyFunctionalInterface my = new MyFunctionalInterfaceImpl () {
            @Override
            public void myMethod() {
                System.out.println("2번 이름없는 클래스로 구현한 결과");
            }
        };
        my.myMethod();
    }
}