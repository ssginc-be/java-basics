package com.qriosity.day3.iter;

import javax.swing.JOptionPane;

public class Pattern1 {
    public static void main(String[] args) {
        // 숫자 누적
        int sum = 0;
        for (int i = 0; i < 1000; ++i) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("-------------------------");
        // 문자열 누적
        String str = ""; // 누적할거라서 null은 안됨
        for (int i = 0; i < 3; ++i) {
            String data = JOptionPane.showInputDialog("임의의 문자열 입력");
            str += data;
        }
        System.out.println("최종 문자열: " + str);
        System.out.println("-------------------------");
    }
}
