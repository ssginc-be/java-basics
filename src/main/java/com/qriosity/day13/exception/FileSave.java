package com.qriosity.day13.exception;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Queue-ri
 */
public class FileSave {
    public static void main(String[] args) {
        FileWriter file = null;
        try {
            file = new FileWriter("c:/data/java-basics-day13.txt");
            //폴더나 파일은 읽기만, 읽기/쓰기 가능한 경우
            //리눅스로 서버만들어서 폴더와 파일 변경해주어야하는 경우가 있음.
            System.out.println(3/0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e1){
            e1.printStackTrace();
        } finally {
            System.out.println("이건 꼭 실행.");
            try {
                file.close(); // NullPointerException도 처리해야 하긴 한데 여기선 생략됐고 애초에 필수가 아니라서 CTE 발생 x
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("나는 실행될까요....");
    }
}
