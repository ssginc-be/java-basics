package com.qriosity.day19.stream_advanced;

import java.util.Arrays;

/**
 * @author Queue-ri
 */
public class LoopInStream {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        Arrays.stream(intArr)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x)); //스트림이 닫히므로 forEach는 맨 끝에 놓기
        System.out.println("-----------");
        int sum = Arrays.stream(intArr)
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println(x)) //중간 결과 출력!
                .sum();
        System.out.println("-----------");
        System.out.println(sum);
    }
}
