package com.qriosity.day1.swing;

import javax.swing.*;

/**
 * @author Queue-ri
 */
public class SwingMain {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("이름을 입력해주세요.");
        String ageStr = JOptionPane.showInputDialog("나이를 입력하세요.");

        // 나이 입력 예외처리
        while(isInvalid(ageStr)) {
            try {
                Integer.parseInt(ageStr);
            } catch(Exception e) {
                ageStr = JOptionPane.showInputDialog("잘못된 값입니다. 나이를 다시 입력하세요.");
            }
        }
        int age = Integer.parseInt(ageStr);
        System.out.println("이름: " + name + " / 나이: " + age);
    }

    public static boolean isInvalid(String ageStr) {
        try {
            Integer.parseInt(ageStr);
        } catch(Exception e) {
            return true;
        }
        return false;
    }
}
