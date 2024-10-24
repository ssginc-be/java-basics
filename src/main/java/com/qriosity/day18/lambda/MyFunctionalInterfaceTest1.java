package com.qriosity.day18.lambda;

/**
 * @author Queue-ri
 */

// 인터페이스 사용 방법 3가지
// 1. 이름있는 클래스로 구현해서 사용
public class MyFunctionalInterfaceTest1 {
    public static void main(String[] args) {
        MyFunctionalInterface my = new MyFunctionalInterfaceImpl();
        my.myMethod();
    }
}

class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
    @Override
    public void myMethod() {
        System.out.println("1번 이름있는 클래스로 구현한 결과");
    }
}
