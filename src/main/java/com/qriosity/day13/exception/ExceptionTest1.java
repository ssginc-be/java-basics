package com.qriosity.day13.exception;

/**
 * @author Queue-ri
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        ErrorTest et = new ErrorTest();
        et.call();
        System.out.println("이 줄이 실행될까?");
    }
}

class ErrorTest {
    public void call() {
        System.out.println(42 / 0);
    }
}
