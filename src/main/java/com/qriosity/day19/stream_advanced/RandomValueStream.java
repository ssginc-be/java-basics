package com.qriosity.day19.stream_advanced;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @author Queue-ri
 */
public class RandomValueStream {
    public static void main(String[] args) {
        System.out.println(
                IntStream.rangeClosed(1, 100).sum()
        );

        System.out.println(
                IntStream.range(1, 100).sum()
        );

        Random r = new Random();
        //랜덤한 값 만들어서 바로 스트림에 넣을 수 있음.
        int result = r.ints(100, 1,
                100).distinct().sum();
        System.out.println(result);

        //r.ints(100, 1, 100).sorted().forEach(System.out::println);
        r.doubles(2000, 0, 100).forEach(System.out::println);
        DoubleStream ds = r.doubles(2000, 0, 100);


        //ds.forEach(System.out::println);
        long count = ds.distinct().count();
        System.out.println("중복 제거한 개수>> " + count + "개"); //2000
        r.doubles(2000, 0, 100)
                .distinct().sorted().forEach(System.out::println);
    }
}
