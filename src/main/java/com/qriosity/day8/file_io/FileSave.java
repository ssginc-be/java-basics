package com.qriosity.day8.file_io;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Queue-ri
 */
public class FileSave {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("제목 입력");
        String s2 = JOptionPane.showInputDialog("내용 입력");
        String s3 = JOptionPane.showInputDialog("날짜 입력");

        try {
            FileWriter f = new FileWriter("c:\\data\\" + s3 + ".txt");
            f.close();
        } catch (IOException e) {
            System.out.println("에러 터짐 ㅇㅇ");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
