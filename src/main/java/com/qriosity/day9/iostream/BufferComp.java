package com.qriosity.day9.iostream;

import java.io.*;

/**
 * @author Queue-ri
 */
public class BufferComp {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/java-basics-day9.txt");
            Reader reader = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(reader);
            //BufferedReader bf2 = new BufferedReader(new BufferedReader(new FileInputStream("c:/data/java-basics-day9.txt")));
            long start = System.nanoTime();
            while (true) {
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            long end = System.nanoTime();
            System.out.println(end-start);
            is.close();
            reader.close();
            bf.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
