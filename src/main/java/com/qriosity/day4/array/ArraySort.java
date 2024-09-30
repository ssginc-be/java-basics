package com.qriosity.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열에 여러번 입력한 데이터를 넣어주는 패턴
        int[] save = new int[5];
        for (int i = 0; i < save.length; i++) {
            System.out.print("숫자 입력>> ");
            save[i] = sc.nextInt(); // 모든 입력은 String인데 nextInt()가 int로 변환해줌
        }
        System.out.println(Arrays.toString(save));
        sc.close();

        Arrays.sort(save); // 오름차순 정렬
        System.out.println("최소값: " + save[0]);
        System.out.println("최대값: " + save[save.length - 1]);
    }
}
