package com.qriosity.day18.quiz;

import java.util.Arrays;
import java.util.List;

/**
 * @author Queue-ri
 */
public class Quiz7 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");
        strings.stream()
                .filter(e -> e.length() > 4)
                .forEach(System.out::println);
    }
}
