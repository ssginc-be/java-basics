package com.qriosity.day8.file_io;

import java.io.*;

/**
 * @author Queue-ri
 */
public class FileIstream {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/java-basics-day8.txt");

            while (true) {
                int data = is.read();
                System.out.println(data);
                if (data == -1) break;
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
