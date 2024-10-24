package com.qriosity.day18.quiz;

import java.util.Arrays;
import java.util.List;

/**
 * @author Queue-ri
 */
public class Quiz3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Hi", "smile");
        List<String> result1 = words.stream()
                .filter(e -> e.length() > 4)
                .map(e -> e.toUpperCase())
                .toList();
        System.out.println(result1);

        List<String> result2 = words.stream()
                .map(e -> e + "님")
                .toList();
        System.out.println(result2);
    }
}
