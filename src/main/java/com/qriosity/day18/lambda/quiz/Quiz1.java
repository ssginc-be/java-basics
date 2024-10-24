package com.qriosity.day18.lambda.quiz;

/**
 * @author Queue-ri
 */
public class Quiz1 {
    public static void main(String[] args) {
        // 두 숫자를 더하는 람다식 구현
        SumFunctionalInterface sum = (a, b) -> a + b;
        // 두 숫자를 더한 결과 출력
        int result = sum.add(5, 10);
        System.out.println("더한 결과: " + result);
    }
}
