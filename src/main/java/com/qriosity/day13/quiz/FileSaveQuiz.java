package com.qriosity.day13.quiz;

import java.io.*;
import java.util.Scanner;

/**
 * @author Queue-ri
 */
public class FileSaveQuiz {
    public static void main(String[] args) {
        FileWriter file = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("파일명 입력 >> ");
        String fileName = sc.nextLine();
        System.out.print("파일 내용 입력 >> ");
        String fileContent = sc.nextLine();

        OutputStream os = null;

        try {
            file = new FileWriter(fileName);
            os = new FileOutputStream(fileName);
            os.write(fileContent.getBytes());
        } catch (IOException e) { // FileNotFoundException을 포함
            System.out.println("* * * IOException 발생");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("* * * NullPointerException 발생");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("* * * 기타 Exception 발생");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("* * * FileSaveQuiz 실행 완료");
            try {
                file.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
