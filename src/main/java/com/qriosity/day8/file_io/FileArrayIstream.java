package com.qriosity.day8.file_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Queue-ri
 */
public class FileArrayIstream {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("c:/data/java-basics-day8-2.txt");
            byte[] buf = {10, 20, 30};
            os.write(buf);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
