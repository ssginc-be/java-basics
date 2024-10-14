package com.qriosity.day10.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Queue-ri
 */
public class RegEx3 {
    public static void main(String[] args) {
        String name = "큐리";
        String tel = "010-1234-5678";
        String email = "qriosity@gmail.com";

        // \\w 는 문자 전체, \\d 는 숫자 전체
        boolean name_chk = Pattern.matches("^[가-힣]*$", name);
        boolean tel_chk = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", tel);
        boolean email_chk = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);

        System.out.println("이름: " + name_chk);
        System.out.println("전화번호: " + tel_chk);
        System.out.println("이메일: " + email_chk);
    }
}
