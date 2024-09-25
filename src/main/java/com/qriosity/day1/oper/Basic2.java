package com.qriosity.day1.oper;

import javax.swing.*;

/**
 * @author Queue-ri
 */
public class Basic2 {
    public static void main(String[] args) {
        // 정수1 입력 --> a 변수 저장, 333
        // 정수2 입력 --> b 변수 저장, 222
        String a = JOptionPane.showInputDialog("정수값을 입력하세요.");
        String b = JOptionPane.showInputDialog("정수값을 입력하세요.");

        // 입력 받은 데이터를 int로 각각 변환하여 a2, b2로 저장
        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);

        // 두 입력값의 평균을 실수로 구하시오.
        double avg = (a2 + b2) / 2.0;
        System.out.println("평균: " + avg);

        // swing 컴포넌트로 출력하기
        // null의 의미: 상위 컴포넌트 위에 플로팅처럼 띄울건지의 여부 결정 --> null은 RAM에 관련 주소 없음을 의미
        JOptionPane.showMessageDialog(null, avg);
    }
}
