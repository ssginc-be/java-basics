package com.qriosity.day6.quiz;

import java.util.Scanner;

/**
 * @author Queue-ri
 */
public class Quiz1 {
    public static void main(String[] args) {
        String[] title = {"사랑과 전쟁: 열두 번째 남자", "데드풀과 울버린", "인사이드 아웃 2", "용감한 시민", "귀공자"};
        int[] price = {1000, 10900, 10900, 2750, 1540};

        System.out.println("네이버 시리즈온 실시간 영화 목록:");
        for (int i = 0; i < title.length; i++) {
            System.out.println((i+1) + ".\t" + title[i] + " - 가격: " + price[i] + "원");
        }

        System.out.println("\n정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5):");
        Scanner sc = new Scanner(System.in);
        int selected = sc.nextInt();
        System.out.println("선택한 영화: " + title[selected-1]);
        System.out.println("가격: " + price[selected-1] + "원");
    }
}
