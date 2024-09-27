package com.qriosity.day3.proc;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        // 입력 --> RAM
        Scanner sc = new Scanner(System.in);
        System.out.printf("나이 입력>> ");
        int age = sc.nextInt();
        System.out.printf("아침 먹었는지 여부(true/false)>> ");
        boolean result = sc.nextBoolean();
        sc.close();

        // 처리 --> CPU
        int nextAge = age + 1;

        // 출력
        System.out.println("당신의 내년 나이는 " + nextAge + "세");
        System.out.println("점심을 " + (result ? "조금" : "많이") + " 먹어야 되겠네요!");
    }
}
