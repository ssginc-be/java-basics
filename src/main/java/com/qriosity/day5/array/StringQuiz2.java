package com.qriosity.day5.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Queue-ri
 */
public class StringQuiz2 {
    public static void main(String[] args) {
        String all = "국어, 영어, 수학, 컴퓨터";

        // String --> String[] 변환하기
        String[] arr = all.split(",");

        // 공백 제거하기
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i].trim();
        }

        // 과목 수는?
        System.out.println("과목 수: " + arr.length);

        // 컴퓨터의 위치는?
        System.out.print("컴퓨터의 위치: ");
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].equals("컴퓨터"))
                System.out.println(i);
        }

        // 과목명이 3글자 미만인 과목 수는?
        int cnt = 0;
        for (String s : arr) {
            if (s.length() < 3)
                ++cnt;
        }
        System.out.println("3글자 미만 과목명의 수: " + cnt);

        System.out.println("12345".length());
    }
}
