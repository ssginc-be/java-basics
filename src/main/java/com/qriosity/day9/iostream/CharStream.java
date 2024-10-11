package com.qriosity.day9.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author Queue-ri
 */
public class CharStream {
    public static void main(String[] args) {
        try {
            // 한 문자씩 읽기
            Reader reader = new FileReader("c:/data/java-basics-day8.txt");
            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.println((char) data);
            }
            reader.close();
            System.out.println();

            // 문자 배열로 읽기
            reader = new FileReader("c:/data/java-basics-day8.txt");
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; ++i) {
                    System.out.print(data[i]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
