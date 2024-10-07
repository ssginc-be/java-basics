package com.qriosity.day6.array;

import javax.swing.*;

/**
 * @author Queue-ri
 */
public class SwingGraphicTest {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setTitle("그래픽 연습");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton();
        b.setText("나를 눌러!");

        f.add(b);

        // setVisible은 맨 마지막에
        f.setVisible(true);
    }
}
