package com.qriosity.day4.array;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class ArrayPattern {
    public static void main(String[] args) {
        // 1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        int[] score = new int[5];

        // 랜덤 값 할당
        Random random = new Random();
        for (int i = 0; i < score.length; ++i) {
            score[i] = random.nextInt(101); // 0 ~ 100
        }
        System.out.println(Arrays.toString(score));

        // 직접 입력
        for (int i = 0; i < score.length; ++i) {
            int input = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "번쩨 숫자 입력: "));
            score[i] = input;
        }
        System.out.println(Arrays.toString(score));

        // 2. 배열에 있는 값을 꺼내어 누적
        int sum = 0;
        for (int x : score) {
            sum += x;
        }
        System.out.println("score의 합: " + sum);

        // 3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        int sum2 = 0;
        for (int x : score) {
            if (x >= 80) {
                sum2 += x;
            }
        }
        System.out.println("80점 이상 score의 합: " + sum2);

        // 4. 배열에 있는 값을 가지고 위치를 찾는 경우
        for (int i = 0; i < score.length; ++i) {
            System.out.print(i + ": ");
            if (score[i] == 88) {
                // 88이 하나인 경우 찾은 직후 반복 종료하는 것이 좋음
                System.out.println("88 찾음!");
                break;
            }
            System.out.println("ㄴㄴ");
        }
    }
}
