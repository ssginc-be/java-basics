package com.qriosity.day1._quiz;

import javax.swing.*;

/**
 * @author Queue-ri
 */
public class Q3 {
    public static void main(String[] args) {
        String math1 = JOptionPane.showInputDialog("첫 번째 수학 점수를 입력하세요:");
        String math2 = JOptionPane.showInputDialog("두 번째 수학 점수를 입력하세요:");
        String eng1 = JOptionPane.showInputDialog("첫 번째 영어 점수를 입력하세요:");
        String eng2 = JOptionPane.showInputDialog("두 번째 영어 점수를 입력하세요:");

        double mathAvg = (Integer.parseInt(math1) + Integer.parseInt(math2)) / 2.0;
        double engAvg = (Integer.parseInt(eng1) + Integer.parseInt(eng2)) / 2.0;
        String resultStr = "수학 평균 점수: " + mathAvg + "\n영어 평균 점수: " + engAvg;
        JOptionPane.showMessageDialog(null, resultStr);
    }

}
