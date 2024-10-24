package com.qriosity.day18.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Queue-ri
 */
public class LambdaStream1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("홍길동");
        names.add("김길동");
        names.add("송길동");
        names.add("정길동");
        names.add("홍길동2");

        List<String> result = names.stream()
                .filter(x -> x.startsWith("홍")) // . 계속 붙여가면서 작성 --> 체인식 코드
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
