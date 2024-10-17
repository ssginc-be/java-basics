package com.qriosity.day13.thread;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * @author Queue-ri
 */

public class ThreadGraphicTest {
    public static void main(String[] args) {
        ThreadGraphic thg = new ThreadGraphic();
    }
}

class ThreadGraphic extends JFrame {
    JLabel count, image, day; //전역변수, 아무데서나 접근 가능.

    public ThreadGraphic(){
        setSize(730, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        count = new JLabel("카운트");
        image = new JLabel();
        day = new JLabel("년월일");

        FlowLayout flow = new FlowLayout(); //add()할때 순서대로 화면에 배치!
        setLayout(flow);

        Font font = new Font("궁서", Font.BOLD, 80);
        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        // JFrame에 끼워넣음.
        add(count);
        add(image);
        add(day);

        CounterThread c = new CounterThread();
        c.start();
        ArrayThread a = new ArrayThread();
        a.start();
        TimeThread t = new TimeThread();
        t.start();

        //맨끝!
        setVisible(true);
    } //생성자

    //클래스안에 끼워진 클래스(내부클래스, innerClass)
    //전역변수를 공유할 목적으로!
    public class TimeThread extends Thread {

        public void run(){
            for (int i = 0; i < 3000; ++i) {
                day.setText("시각 >> " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("TimeThread: 문제가 생김.");
                }
            }
        }
    }

    public class ArrayThread extends Thread {
        String[] imgs = {
                "assets/webtoon-posters/1.png",
                "assets/webtoon-posters/2.png",
                "assets/webtoon-posters/3.png",
                "assets/webtoon-posters/4.png",
                "assets/webtoon-posters/5.png"
        };

        public void run(){
            for (int i = 0; i < imgs.length; ++i) {
                ImageIcon icon = new ImageIcon(imgs[i]);
                image.setIcon(icon);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("ArrayThread: 문제가 생김.");
                }
            }
        }
    }

    public class CounterThread extends Thread {
        final int INIT_VALUE = 20;

        public void run() {
            for (int i = INIT_VALUE; i > -1; --i) {
                if (i == INIT_VALUE) {
                    Toolkit.getDefaultToolkit().beep();
                }

                count.setText("카운터 >> " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("CounterThread: 문제가 생김.");
                }

                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "사용시간이 종료되었습니다.");
                    dispose(); // JFrame을 닫음 (deprecated 된 stop()은 쓰지 마시오)
                }
            }
        }
    }

}