package com.qriosity.day3.iter;

public class While1 {
    public static void main(String[] args) {
        int i = 1; // 초기값
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("---------------");
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
    }
}
