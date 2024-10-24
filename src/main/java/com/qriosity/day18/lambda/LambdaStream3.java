package com.qriosity.day18.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Queue-ri
 */
public class LambdaStream3 {
    public static void main(String[] args) {
        //배열에 있는 데이터를 바로 List에 넣을 수 있음.
        List<String> words = Arrays.asList("hi", "hello", "sun", "sky", "sea");

        words.stream().filter(x -> x.length() >= 3)
                .forEach(System.out::println);
    }
}
