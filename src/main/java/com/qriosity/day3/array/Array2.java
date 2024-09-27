package com.qriosity.day3.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        String[] names = {"가나다", "라마바", "사아자", "차카타", "타파하"};
        for (int i = 0; i < names.length; ++i) {
            System.out.println(names[i]);
        }
        // for-each loop 방식
        for (String s : names) {
            System.out.println(s);
        }
        // 배열 내용을 가장 간단하고 빠르게 출력할 수 있는 방법
        System.out.println(Arrays.toString(names));
    }
}
