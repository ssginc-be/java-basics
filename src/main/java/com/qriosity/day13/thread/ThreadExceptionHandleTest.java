package com.qriosity.day13.thread;

/**
 * @author Queue-ri
 */
public class ThreadExceptionHandleTest {
    public static void main(String[] args) {
        System.out.println("1. 나는 출력될 예정");

        try {
            System.out.println("2. 나는 문제코드 " + (10 / 0));
        } catch (Exception e) {
            System.out.println("문제 발생!! --------");
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
            System.out.println("------------------");
        }

        System.out.println("3. 나는 출력될까?");
    }
}
