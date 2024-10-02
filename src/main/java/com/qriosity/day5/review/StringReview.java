package com.qriosity.day5.review;

public class StringReview {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, World!");
        sb.replace(0, 5, "Bye");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }
}
