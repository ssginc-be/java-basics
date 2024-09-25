package com.qriosity.day1._quiz;

import java.util.Scanner;

/**
 * @author Queue-ri
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("여행 지역을 입력하세요: ");
        String country = sc.nextLine();
        System.out.printf("1인당 경비를 입력하세요: ");
        double budget = sc.nextDouble();
        System.out.printf("여행 인원을 입력하세요: ");
        int memNum = sc.nextInt();
        double totalBudget = budget * memNum;
        System.out.printf("할인율(%%)을 입력하세요: ");
        double discount = sc.nextDouble();
        System.out.printf("VIP 여부 (true/false)를 입력하세요: ");
        boolean isVip = sc.nextBoolean();
        int vipDiscount = isVip ? 5 : 0;
        double discPrice = totalBudget / 100 * (discount + vipDiscount);
        sc.nextLine(); // ignore previous linefeed
        System.out.printf("당부의 말을 입력하세요: ");
        String comment = sc.nextLine();

        System.out.println("\n===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역: " + country);
        System.out.println("1인당 경비: " + budget + "원");
        System.out.println("여행 인원: " + memNum + "명");
        System.out.println("기본 할인율: " + discount + "%");
        System.out.println("VIP 추가 할인율: " + vipDiscount + "%");
        System.out.println("최종 할인율: " + (discount + vipDiscount) + "%");
        System.out.println("총 경비: " + totalBudget + "원");
        System.out.println("할인 금액: " + discPrice + "원");
        System.out.println("할인 후 총 경비: " + (totalBudget - discPrice) + "원");
        System.out.println("당부의 말: " + comment);

        // 스캐너 좀 닫아라
        sc.close();
    }
}
