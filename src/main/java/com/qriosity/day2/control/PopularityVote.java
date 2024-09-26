package com.qriosity.day2.control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Queue-ri
 */
public class PopularityVote {
    public static void main(String[] args) {
        JFrame f = new JFrame("Popularity Vote");
        f.setSize(370, 700);

        // 폰트 및 프레임 레이아웃 지정
        Font font = new Font("나눔고딕", Font.BOLD, 20);
        FlowLayout layout = new FlowLayout();
        f.setLayout(layout);

        // 제목 레이블 생성
        JLabel lb1 = new JLabel("인기투표 시스템");
        lb1.setFont(font);
        
        // 이미지 넣을 버튼 생성
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        
        // 버튼 옆 라벨
        JLabel lb2 = new JLabel("아이유");
        lb2.setFont(font);
        JLabel lb3 = new JLabel("프로미스나인");
        lb3.setFont(font);
        JLabel lb4 = new JLabel("스테이씨");
        lb4.setFont(font);

        // 버튼에 이미지 할당
        // 기본 경로는 프로젝트 루트 경로 (java-basics 폴더)
        ImageIcon icon1 = new ImageIcon("assets/001.png");
        b1.setIcon(icon1);
        ImageIcon icon2 = new ImageIcon("assets/002.png");
        b2.setIcon(icon2);
        ImageIcon icon3 = new ImageIcon("assets/003.png");
        b3.setIcon(icon3);

        f.add(lb1);
        f.add(b1); f.add(lb2);
        f.add(b2); f.add(lb3);
        f.add(b3); f.add(lb4);

        // 버튼 이벤트 리스너
        // ActionListener --> interface
        b1.addActionListener(new ActionListener() {
            int iuCnt = 0;
            public void actionPerformed(ActionEvent e) {
                ++iuCnt;
                lb2.setText("아이유: " + iuCnt);
                System.out.println("버튼 1 클릭됨.");
            }
        });

        b2.addActionListener(new ActionListener() {
            int froCnt = 0;
            public void actionPerformed(ActionEvent e) {
                ++froCnt;
                lb3.setText("프로미스나인: " + froCnt);
                System.out.println("버튼 2 클릭됨.");
            }
        });

        b3.addActionListener(new ActionListener() {
            int stayCnt = 0;
            public void actionPerformed(ActionEvent e) {
                ++stayCnt;
                lb4.setText("스테이씨: " + stayCnt);
                System.out.println("버튼 3 클릭됨.");
            }
        });

        f.setVisible(true);
    }
}
