package com.qriosity.day18.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * @author Queue-ri
 */
public class Quiz8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result1 = Arrays.stream(arr)
                .filter(e -> (e & 1) == 1)
                .sum();
        System.out.println(result1);

        int[] arr2 = {5, 3, 10, 40, 2};
        OptionalInt result2 = Arrays.stream(arr2).max();
        System.out.println(result2.getAsInt());

        int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10};
        Arrays.stream(arr3)
                .filter(e -> e > 5)
                .distinct()
                .forEach(System.out::println);

        List<Integer> resultList = Arrays.stream(arr3)
                .filter(e -> e > 5)
                .distinct()
                .boxed() // boxing 필요
                .toList();
    }
}
