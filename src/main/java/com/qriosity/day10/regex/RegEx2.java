package com.qriosity.day10.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Queue-ri
 */
public class RegEx2 {
    public static void main(String[] args) {
        Pattern pt = Pattern.compile("^[0-9]*$");
        String str1 = "abcaa";
        String str2 = "123";
        String str3 = "";

        Matcher res1 = pt.matcher(str1);
        Matcher res2 = pt.matcher(str2);
        Matcher res3 = pt.matcher(str3);

        System.out.println(res1.find());
        System.out.println(res2.find());
        System.out.println(res3.find());
    }
}
