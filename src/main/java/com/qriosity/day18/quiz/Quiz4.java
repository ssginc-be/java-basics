package com.qriosity.day18.quiz;

import java.util.Arrays;
import java.util.List;

/**
 * @author Queue-ri
 */
public class Quiz4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("파인애플", "송아지", "양", "스마일", "소");
        List<String> result1 = strings.stream()
                .filter(e -> e.length() == 1)
                .toList();
        System.out.println(result1);

        List<String> images = Arrays.asList("1.png", "2.png", "3.jpeg", "4.jpeg");
        List<String> result2 = images.stream()
                .filter(e -> e.endsWith("jpeg"))
                .toList();
        System.out.println(result2);
    }
}
