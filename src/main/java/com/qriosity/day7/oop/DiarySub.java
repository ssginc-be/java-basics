package com.qriosity.day7.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Queue-ri
 */
public class DiarySub {
    static JFrame f;
    static JTextField tfDate;
    static JTextField tfTitle;
    static JTextField tfContent;

    public static void main(String[] args) {
        f = new JFrame();
        f.setSize(350, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lbDate = new JLabel("오늘의 날짜");
        JLabel lbTitle = new JLabel("오늘의 제목");
        JLabel lbContent = new JLabel("오늘의 내용");

        Font ftLabel1 = new Font("굴림", Font.BOLD, 16);
        Font ftLabel2 = new Font("굴림", Font.BOLD, 22);
        lbDate.setFont(ftLabel1);
        lbTitle.setFont(ftLabel1);
        lbContent.setFont(ftLabel1);
        
        tfDate = new JTextField(10);
        tfTitle = new JTextField(10);
        tfContent = new JTextField(10);
        tfDate.setFont(ftLabel1);
        tfTitle.setFont(ftLabel1);
        tfContent.setFont(ftLabel2);
        
        JButton btnSave = new JButton("파일에 일기 저장");
        btnSave.setFont(ftLabel2);

        // 레이아웃
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        // 색상
        f.setBackground(Color.YELLOW);
        tfDate.setForeground(Color.BLUE);
        tfTitle.setForeground(Color.BLUE);
        tfContent.setForeground(Color.BLUE);
        btnSave.setBackground(Color.MAGENTA);

        // 배치
        f.add(lbDate);
        f.add(tfDate);
        f.add(lbTitle);
        f.add(tfTitle);
        f.add(lbContent);
        f.add(tfContent);
        f.add(btnSave);

        // 저장 버튼 리스너
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // print() or saveFile()
                saveFile();
            }
        });

        f.setVisible(true);
    }

    public static void print() {
        System.out.println("----------- 저 장 완 료 -----------");
        System.out.println("오늘의 날짜: " + tfDate.getText());
        System.out.println("오늘의 제목: " + tfTitle.getText());
        System.out.println("오늘의 내용: " + tfContent.getText());
        System.out.println("-----------------------------------");
    }

    public static void saveFile() {
        try {
            FileWriter file = new FileWriter("asdf.txt");
            file.write("오늘의 날짜: " + tfDate.getText() + "\n");
            file.write("오늘의 제목: " + tfTitle.getText() + "\n");
            file.write("오늘의 내용: " + tfContent.getText() + "\n");
            file.close();
            JOptionPane.showMessageDialog(f, "파일을 저장했습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장에 실패했습니다."); // 이 부분 24-10-08 노션 확인 ㄱㄱ
        }
    }
}
