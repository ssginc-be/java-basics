package com.qriosity.day9.quiz;

import java.io.*;
import java.nio.Buffer;

/**
 * @author Queue-ri
 */
public class BufferQ3 {
    // 파일정리 문제 3번:
    // build.gradle 버퍼에 넣어 한 줄씩 읽어서 프린트하고
    // nanoTime으로 처리 시간 계산하기
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("build.gradle")));
            long start = System.nanoTime();
            while (true) {
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            long end = System.nanoTime();
            System.out.println(end-start);
            bf.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
