package com.qriosity.day6.array;

import javax.swing.*;

/**
 * @author Queue-ri
 */
public class TwoDimTable {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        String header[] = {"a", "b", "c"};
        String contents[][] = {
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"}
        };
        JTable table = new JTable(contents, header);
        JScrollPane scroll = new JScrollPane(table);
        f.add(scroll);
        f.setVisible(true);
    }
}
