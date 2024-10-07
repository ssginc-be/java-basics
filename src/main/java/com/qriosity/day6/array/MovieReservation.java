package com.qriosity.day6.array;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Queue-ri
 */
public class MovieReservation {
    static int count = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(560, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow); // add()한 순서대로 붙여주는 레이아웃

        for (int i = 0; i < 100; i++) {
            JButton button = new JButton();
            button.setText(i + "");
            frame.add(button);

            button.addActionListener(new ActionListener() {
                @Override // 추상메소드 오버라이딩
                public void actionPerformed(ActionEvent e) {
                    // 버튼 클릭 시 실행되는 부분
                    String s = e.getActionCommand(); // 버튼 위에 있는 글자 가져오기
                    System.out.println(s);
                    JOptionPane.showMessageDialog(frame, s+"번 예매됨.");
                    button.setEnabled(false);
                    button.setBackground(Color.red);
                }
            });
        }

        frame.setVisible(true);
    }
}
