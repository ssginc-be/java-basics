package com.qriosity.day18.lambda.quiz;

/**
 * @author Queue-ri
 */
public class Quiz2 {
    public static void main(String[] args) {
        StringFunctionalInterface str = (String s) -> s.toUpperCase();
        String result = str.convert("Queue-ri");
        System.out.println("변환 결과: " + result);
    }
}
