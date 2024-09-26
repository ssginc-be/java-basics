package com.qriosity.day2.control;

import javax.swing.*;

/**
 * @author Queue-ri
 */
public class Basic2 {
    public static void main(String[] args) {
        String answer = "맑음";

        String userAns = JOptionPane.showInputDialog("날씨가 어때?");
        System.out.println(answer.equals(userAns)); // '맑음'과 똑같이 입력했는지 확인

        final double TEMP = 20;
        final double HUMID = 70;
        String userTempStr = JOptionPane.showInputDialog("온도를 입력하세요.");
        String userHumidStr = JOptionPane.showInputDialog("습도를 입력하세요.");
        double userTemp = Double.parseDouble(userTempStr);
        double userHumid = Double.parseDouble(userHumidStr);
        System.out.println(userTemp > TEMP && userHumid > HUMID);

        double d = 123.456789123456789;
        System.out.println((int)d);
        System.out.printf("%.2f", d); // 소수점 둘째자리까지 반올림하여 출력
    }
}
