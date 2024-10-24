package com.qriosity.day18.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Queue-ri
 */
public class LambdaStream2 {
    public static void main(String[] args) {
        //배열에 있는 데이터를 바로 List에 넣을 수 있음.
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
