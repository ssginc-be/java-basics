package com.qriosity.day10.regex;

import java.util.regex.Pattern;

/**
 * @author Queue-ri
 */
public class RegEx1 {
    public static void main(String[] args) {
        String pt = "^[a-zA-Z]*$";
        String str1 = "abcaa";
        String str2 = "123";
        String str3 = "";

        boolean res1 = Pattern.matches(pt, str1);
        boolean res2 = Pattern.matches(pt, str2);
        boolean res3 = Pattern.matches(pt, str3);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
