package com.qriosity.day5.array;

/**
 * @author Queue-ri
 */
public class PrimitiveCopy {
    public static void main(String[] args) {
        int math1 = 100;
        int math2 = math1; // 기본형 복사

        math2 = 96;
        // 기본형은 값을 복사함을 알 수 있다.
        System.out.println(math1 + " " + math2); // 100 96
    }
}
