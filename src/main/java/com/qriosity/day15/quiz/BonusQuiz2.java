package com.qriosity.day15.quiz;

/**
 * @author Queue-ri
 */
public class BonusQuiz2 {
    public static void main(String[] args) {
        // Generic 추가문제 2:

        // 정수 비교
        boolean result1 = compare(10, 10);
        System.out.println("10과 10은 같은가? " + result1);

        // 문자열 비교
        boolean result2 = compare("Hello", "World");
        System.out.println("'Hello'와 'World'는 같은가? " + result2);
    }

    // 제네릭 메서드를 이용한 값 비교
    public static <T> boolean compare(T a, T b) {
        return a.equals(b);
    }
}
