package com.qriosity.day3.proc;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        // 입력 시 자동으로 년월일, 시분초로 저장하고 싶을 때
        Date d = new Date();
        int year = d.getYear() + 1900;
        int month = d.getMonth() + 1;
        int date = d.getDate();
        int day = d.getDay();
        int hour = d.getHours();
        int min = d.getMinutes();
        int sec = d.getSeconds();

        final String DAY_STR = "일월화수목금토";
        System.out.println(year + "년 " + month + "월 " + date + "일 " + DAY_STR.charAt(day) + "요일 " + hour + "시 " + min + "분 " + sec + "초");
    }
}
