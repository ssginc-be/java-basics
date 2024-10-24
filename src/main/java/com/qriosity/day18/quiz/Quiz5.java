package com.qriosity.day18.quiz;

import java.util.Arrays;

/**
 * @author Queue-ri
 */
public class Quiz5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 6, 8};
        Arrays.stream(arr)
                .filter(e -> e > 3)
                .distinct()
                .forEach(System.out::println);

        // 모두 더한 수 출력하기
        double[] arr2 = {5.0, 3.0, 1.0, 33.0, 35.0};
        double result = Arrays.stream(arr2).sum();
        System.out.println(result);

        String[] arr3 = {"정신과", "내과", "신경과", "정형외과"};
        Arrays.stream(arr3)
                .map(e -> e + "사무실")
                .forEach(System.out::println);
    }
}
