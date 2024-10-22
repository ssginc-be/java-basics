package com.qriosity.day16.oop_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Queue-ri
 */
public class WordLengthCounter {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.getContentPane().setBackground(Color.green);
        //체인식 코드!
        JTextArea area = new JTextArea(3, 10);
        area.setBackground(Color.yellow);
        area.setLineWrap(true);
        area.setAutoscrolls(true);
        Font font = new Font("굴림", Font.BOLD,  40);
        area.setFont(font);
        JButton b1 = new JButton("글자수/단어분석");
        JButton b2 = new JButton("배경색변경");
        JButton b3 = new JButton("글자색변경");
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b1.setBackground(Color.PINK);
        b2.setBackground(Color.BLUE);
        b3.setBackground(Color.LIGHT_GRAY);
        f.add(area);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // listeners
        b1.addActionListener(new ActionListener() { // ActionListener는 interface
            @Override // implement
            public void actionPerformed(ActionEvent e) {
                // area에 쓴 글자들을 가지고 와서
                String data = area.getText();
                // 글자수와 단어수를 파악
                int length = data.length();
                String[] dataList = data.split(" ");
                int count = dataList.length;
                // 결과창 띄우기
                JOptionPane.showMessageDialog(
                        f,
                        "단어수는 " + count + "\n" + "글자수는 " + length
                );
            }
        });

        //맨 끝!
        f.setVisible(true);
    }
}
