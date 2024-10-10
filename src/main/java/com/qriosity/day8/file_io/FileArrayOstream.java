package com.qriosity.day8.file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Queue-ri
 */
public class FileArrayOstream {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/java-basics-day8-2.txt");
            byte[] data = new byte[100];

            while (true) {
                int num = is.read(data);
                if (num == -1) break;

                for (int i = 0; i < num; ++i) {
                    System.out.println(data[i]);
                }
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
