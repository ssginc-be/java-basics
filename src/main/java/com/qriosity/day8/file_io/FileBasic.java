package com.qriosity.day8.file_io;

import java.io.File;

/**
 * @author Queue-ri
 */
public class FileBasic {
    public static void main(String[] args) {
        File file = new File("C:\\openjdk-17+35_windows-x64_bin\\jdk-17\\bin");
        System.out.println(file.exists());
        System.out.println(file.isFile());

        // 디렉토리 == 폴더 == 패키지
        System.out.println(file.isDirectory());
        System.out.println(file.listFiles()); // 배열 주소가 찍힘
        File[] flist = file.listFiles();
        System.out.println(flist.length);
        for (File f : flist) {
            if (f.getName().endsWith(".exe"))
                System.out.println(f.getName());
        }

        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());

    }
}
