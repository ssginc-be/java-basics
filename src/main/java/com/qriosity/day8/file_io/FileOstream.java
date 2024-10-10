package com.qriosity.day8.file_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Queue-ri
 */
public class FileOstream {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("c:/data/java-basics-day8.txt");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
