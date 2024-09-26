package com.qriosity.day2.control;

import javax.swing.*;
import java.awt.*;

/**
 * @author Queue-ri
 */
public class Basic3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b1 = new JButton();
        JButton b2 = new JButton();

        f.setSize(300, 300);

        b1.setText("나를 클릭하세요.");
        b2.setText("나도 클릭하세요.");
        b1.setBackground(Color.RED);
        b2.setBackground(Color.GREEN);
        b1.setForeground(Color.YELLOW);
        b2.setForeground(Color.ORANGE);

        Font font = new Font("궁서", Font.BOLD, 20);
        b1.setFont(font);
        b2.setFont(font);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        f.add(b1);
        f.add(b2);

        f.setVisible(true);
    }
}
