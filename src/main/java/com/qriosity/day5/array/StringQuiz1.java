package com.qriosity.day5.array;

import java.util.Scanner;

/**
 * @author Queue-ri
 */
public class StringQuiz1 {
    public static void main(String[] args) {
        System.out.print("전화번호입력>>\t");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // 공백 제거하기 (실무 상 필수)
        input = input.trim();

        // -을 기준으로 분리
        String[] arr = input.split("-");

        // 011:SK, 019:LG, others:Apple
        // if 문으로 구현시 equals() 사용해야 함
        switch (arr[0]) {
            case "011":
                System.out.println("SK");
                break;
            case "019":
                System.out.println("LG");
                break;
            default:
                System.out.println("Apple");
        }

        // 두번째 문자열의 길이가 4+이면 최신폰, 아니면 올드폰
        if (arr[1].length() < 4)
            System.out.println("올드폰");
        else
            System.out.println("최신폰");

        // 전체 전화번호의 길이가 10+ 이면 유효한 번호, 아니면 유효하지 않은 번호
        if (arr[0].length() + arr[1].length() + arr[2].length() < 10)
            System.out.println("유효하지 않은 번호입니다.");
        else
            System.out.println("유효한 번호입니다.");

    }
}
