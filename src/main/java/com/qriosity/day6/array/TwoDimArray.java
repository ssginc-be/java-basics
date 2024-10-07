package com.qriosity.day6.array;

/**
 * @author Queue-ri
 */
public class TwoDimArray {
    public static void main(String[] args) {
        // 가로(행, row), 세로(열, column) : 2 X 3
        // 가로의 개수: 2
        // {   0  1  2
        // 0: {0, 0, 0}, //한 행의 세로의 개수: 3
        // 1: {0, 0, 0}
        // }

        int[][] seat = new int[2][3]; //행, 열의 개수
        seat[0][0] = 100;
        seat[0][2] = 200;
        seat[1][1] = 300;
        seat[1][2] = 400;
        System.out.println(seat[1][0]);
        System.out.println(seat.length);
        // 2차원배열에서 배열명.length ==> 행의 개수
        System.out.println(seat[0].length); // 0행의 열 개수
        System.out.println(seat[1].length); // 1행의 열 개수

        for (int i = 0; i < seat.length ; ++i) { // i --> 행의 인덱스
            for (int j = 0; j < seat[i].length; ++j) { // j --> 열의 인덱스
                System.out.print(seat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
