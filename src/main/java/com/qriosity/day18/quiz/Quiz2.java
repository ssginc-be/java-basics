package com.qriosity.day18.quiz;

import java.util.Arrays;
import java.util.List;

/**
 * @author Queue-ri
 */
public class Quiz2 {
    // 기본문제 2번
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // 3 초과인 데이터만 필터링한 새 리스트 생성
        List<Integer> result1 = numbers.stream().filter(e -> e > 3).toList();
        System.out.println(result1.toString());
        List<Integer> result2 = numbers.stream().map(e -> e * 10).toList();
        System.out.println(result2.toString());
    }
}
