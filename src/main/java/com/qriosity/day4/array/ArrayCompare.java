package com.qriosity.day4.array;

import java.util.Random;

public class ArrayCompare {
    public static void main(String[] args) {
        // 토익 채점 시뮬
        int[] answer = new int[990];
        int[] selected = new int[990];

        // 임의의 답안 생성
        Random r = new Random();
        for (int i = 0; i < answer.length; ++i) {
            answer[i] = r.nextInt(4) + 1; // 1 ~ 4
        }

        // 학생의 선택지 저장
        // 진짜 990개 입력 돌릴 순 없으니까 랜덤으로 대체함.
        r = new Random(42);
        for (int i = 0; i < selected.length; ++i) {
            selected[i] = r.nextInt(4) + 1; // 1 ~ 4
        }

        int correctCnt = 0;
        for (int i = 1; i <= answer.length; ++i) {
            System.out.print(i + "  " + selected[i-1] + "  " + answer[i-1] + " -> ");
            if (selected[i-1] == answer[i-1]) {
                correctCnt += 1;
                System.out.println("O");
            }
            else {
                System.out.println("X");
            }
        }

        System.out.println("--------------------------------");
        System.out.println("결과: " + correctCnt + "/990"); // 4지선다라서 확률은 1/4 언저리
    }
}
