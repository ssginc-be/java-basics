package com.qriosity.day6.quiz;

import java.util.Scanner;

/**
 * @author Queue-ri
 */
public class Quiz2 {
    public static void main(String[] args) {
        int[][] seat = new int[3][10];
        int cnt = 0;

        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("0\t1\t2\t3\t4\t5\t6\t7\t8\t9");
            System.out.println("------------------------------------------");
            for (int i = 0; i < seat.length; ++i) {
                for (int j = 0; j < seat[i].length; ++j) {
                    System.out.print(seat[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("------------------------------------------");

            System.out.print("예매 1, 종료 0 >> ");
            Scanner sc = new Scanner(System.in);
            int input1 = sc.nextInt();
            if (input1 == 1) { // 예매
                int y = 0, x = 0;
                System.out.print("예매할 좌석 행번호: >>> ");
                y = sc.nextInt();
                System.out.print("예매할 좌석 열번호: >>> ");
                x = sc.nextInt();

                if (seat[y][x] == 0) {
                    seat[y][x] = 1;
                    ++cnt;
                    System.out.println("예매 완료");
                }
                else {
                    System.out.println("예약 불가");
                }
            }
            else if (input1 == 0) { // 종료
                System.out.println("예매 시스템을 종료합니다.");
                break;
            }
            else {
                System.out.println("다시 입력해주세요.");
            }
        }

        System.out.println("당신의 총 예매 수는 " + cnt + "매");
        System.out.println("당신의 총 금액은 " + (cnt * 10000) + "원");
    }
}
