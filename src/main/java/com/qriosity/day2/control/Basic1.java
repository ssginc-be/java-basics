package com.qriosity.day2.control;

import javax.swing.*;

/**
 * @author Queue-ri
 */
public class Basic1 {
    public static void main(String[] args) {
        String id = "root";
        String pw = "1234";

        // 입력 처리
        String userId = JOptionPane.showInputDialog("아이디를 입력하세요.");
        String userPw = JOptionPane.showInputDialog("비밀번호를 입력하세요.");

        // 유효 여부 확인
        System.out.println(id.equals(userId) && pw.equals(userPw));
    }
}
