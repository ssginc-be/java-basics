package com.qriosity.day8.oop;

/**
 * @author Queue-ri
 */
public class WriteDaily {
    public static void main(String[] args) {
        Diary d = new Diary();
        d.title = "제에목";
        d.content = "내애용";
        d.weather = "나알씨";

        d.write();
        System.out.println(d.title + " " + d.content + " " + d.weather);
    }
}
