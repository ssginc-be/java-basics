package com.qriosity.day9.iostream;

import java.io.*;

/**
 * @author Queue-ri
 */
public class FileCopy {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/java-basics-day9.txt");
            OutputStream os = new FileOutputStream("c:/data/java-basics-day9-2.txt");
            is.transferTo(os);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
