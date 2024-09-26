package com.qriosity.day2.control;

import java.util.Scanner;

/**
 * @author Queue-ri
 */
public class Basic4 {
    public static void main(String[] args) {
        // Scanner는 실무에서 잘 사용되지 않고, 대부분 코테에서 사용됨
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // 한 단어만 입력
        int age = sc.nextInt(); // String --> int
        double salary = sc.nextDouble(); // String --> double
        System.out.println(name + " " + age + " " + salary);
        sc.close();
        
        // 라인피드 하나 남으면 sc.nextLine()으로 버려주면 됨
    }
}
