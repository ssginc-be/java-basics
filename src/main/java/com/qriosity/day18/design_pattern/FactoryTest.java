package com.qriosity.day18.design_pattern;

import java.util.Scanner;

/**
 * @author Queue-ri
 */
public class FactoryTest {
    public static void main(String[] args) {
        ObjectInitFactoryClass factory = new ObjectInitFactoryClass();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("어떤 객체를 생성하시겠습니까? (apple/banana): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            Object obj = factory.getInstance(input);
            if (obj == null) {
                System.out.println("유효하지 않은 입력입니다. 다시 시도해주세요.\n");
            }
            else {
                System.out.println(input + "(이)가 입력되었습니다.\n");
            }
        }
        sc.close();
    }
}
