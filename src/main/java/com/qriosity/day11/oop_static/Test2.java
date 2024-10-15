package com.qriosity.day11.oop_static;

import java.text.DecimalFormat;

/**
 * @author Queue-ri
 */
public class Test2 {
    public static void main(String[] args) {
        double positiveNumber = 1234567.89; double negativeNumber = -1234567.89; // +와 - 기호를 붙이고 소수점 이하 한 자리까지 포맷팅하는 패턴
        DecimalFormat df1 = new DecimalFormat("+#.0;-#.0");
        // 양수의 경우 + 기호와 함께 출력
        System.out.println(df1.format(positiveNumber)); // 출력: +1234567.9
        // 음수의 경우 - 기호와 함께 출력
        System.out.println(df1.format(negativeNumber)); // 출력: -1234567.9

        ////////////////////////////

        DecimalFormat df2 = new DecimalFormat("#.##");
        System.out.println(df2.format(123.1));   // 출력: 123.1
        System.out.println(df2.format(123.12));  // 출력: 123.12
        System.out.println(df2.format(123));     // 출력: 123
        System.out.println(df2.format(0.5));     // 출력: 0.5
        System.out.println(df2.format(0.123));   // 출력: 0.12

        System.out.println();
        //DecimalFormat df2 = new DecimalFormat("0.00");
        //0.50
        //0.12
        //0.12
        DecimalFormat df3 = new DecimalFormat("#.00");
        //.50
        //.12
        //.12
        System.out.println(df3.format(123.1));   // 출력: 123.10
        System.out.println(df3.format(-123.1));   // 출력: -123.10
        System.out.println(df3.format(123.12));  // 출력: 123.12
        System.out.println(df3.format(123));     // 출력: 123.00
        System.out.println(df3.format(0.5));     // 출력: 0.50
        System.out.println(df3.format(0.123));   // 출력: 0.12
        System.out.println(df3.format(0.123));   // 출력: 0.12
    }
}
